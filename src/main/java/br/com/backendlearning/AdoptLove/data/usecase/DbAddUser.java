package br.com.backendlearning.AdoptLove.data.usecase;

import br.com.backendlearning.AdoptLove.data.cryptography.PasswordEncrypter;
import br.com.backendlearning.AdoptLove.data.repository.AddUserRepository;
import br.com.backendlearning.AdoptLove.domain.models.AddUser;
import br.com.backendlearning.AdoptLove.domain.models.User;
import br.com.backendlearning.AdoptLove.domain.usecase.AddUserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbAddUser implements AddUserUseCase {

    @Autowired
    private AddUserRepository repository;

    @Autowired
    private PasswordEncrypter passwordEncrypter;
//
//    public DbAddUser(AddUserRepository repository,
//                     PasswordEncrypter passwordEncrypter) {
//        this.repository = repository;
//        this.passwordEncrypter = passwordEncrypter;
//    }

    @Override
    public boolean createUser(AddUser model) {
        if(!model.password.equals(model.passwordConfirmation)) return false;
        return repository.save(makeUser(model));
    }

    private User makeUser(AddUser addUser) {
        String encryptedPassword = passwordEncrypter.encodePassword(addUser.password);
        return new User(addUser.name,
                addUser.email,
                encryptedPassword);
    }
}
