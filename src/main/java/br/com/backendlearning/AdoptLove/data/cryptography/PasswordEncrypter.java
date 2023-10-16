package br.com.backendlearning.AdoptLove.data.cryptography;

public interface PasswordEncrypter {
    String encodePassword(String password);

    boolean checkPassword(String encryptedPassword, String password);
}