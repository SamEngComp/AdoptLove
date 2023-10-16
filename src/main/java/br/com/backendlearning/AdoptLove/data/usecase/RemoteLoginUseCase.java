package br.com.backendlearning.AdoptLove.data.usecase;

import br.com.backendlearning.AdoptLove.data.cryptography.PasswordEncrypter;
import br.com.backendlearning.AdoptLove.data.repository.RetrieveAllUserRepository;
import br.com.backendlearning.AdoptLove.domain.models.LoginModel;
import br.com.backendlearning.AdoptLove.domain.models.UserModel;
import br.com.backendlearning.AdoptLove.domain.usecase.LoginUseCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RemoteLoginUseCase implements LoginUseCase {

    @Autowired
    private RetrieveAllUserRepository repository;

    @Autowired
    private PasswordEncrypter passwordEncrypter;

    @Override
    public boolean login(LoginModel model) {
        Optional<UserModel> user = retrieveUser(model);
        if(user.isPresent()) return true;
        return false;
    }

    private Optional<UserModel> retrieveUser(LoginModel model) {
        List<UserModel> users = repository.retrieve();
        return users.stream().filter(t -> {
            return passwordEncrypter.checkPassword(t.getPassword(), model.getPassword());
        }).findFirst();
    }

}
