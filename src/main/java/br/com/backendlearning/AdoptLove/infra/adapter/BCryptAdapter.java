package br.com.backendlearning.AdoptLove.infra.adapter;

import br.com.backendlearning.AdoptLove.data.cryptography.PasswordEncrypter;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class BCryptAdapter
        implements PasswordEncrypter {

    @Override
    public String encodePassword(String password) {
        String encrypter = BCrypt.gensalt();
        System.out.println(encrypter);
        return BCrypt.hashpw(password, encrypter);
    }

    @Override
    public boolean checkPassword(String encryptedPassword, String password) {
        return BCrypt.checkpw(password, encryptedPassword);
    }
}
