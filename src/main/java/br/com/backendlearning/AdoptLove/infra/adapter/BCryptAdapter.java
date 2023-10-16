package br.com.backendlearning.AdoptLove.infra.adapter;

import br.com.backendlearning.AdoptLove.data.cryptography.PasswordEncrypter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class BCryptAdapter
        implements PasswordEncrypter {
    @Override
    public String encodePassword(String password) {
        BCryptPasswordEncoder encrypter = new BCryptPasswordEncoder();
        return encrypter.encode(password);
    }
}
