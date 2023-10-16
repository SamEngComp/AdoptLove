package br.com.backendlearning.AdoptLove.data.usecase;

import br.com.backendlearning.AdoptLove.data.cryptography.PasswordEncrypter;
import br.com.backendlearning.AdoptLove.data.repository.AddUserRepository;
import br.com.backendlearning.AdoptLove.domain.models.AddUserModel;
import br.com.backendlearning.AdoptLove.domain.models.UserModel;
import br.com.backendlearning.AdoptLove.domain.usecase.AddUserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbAddUser implements AddUserUseCase {

    @Autowired
    private AddUserRepository repository;

    @Autowired
    private PasswordEncrypter passwordEncrypter;

    @Override
    public boolean createUser(AddUserModel model) {
        if(!model.password.equals(model.passwordConfirmation)) return false;
        return repository.save(makeUser(model));
    }

    private UserModel makeUser(AddUserModel addUser) {
        String encryptedPassword = passwordEncrypter.encodePassword(addUser.password);
        return new UserModel(addUser.name,
                addUser.email,
                encryptedPassword);
    }
}
