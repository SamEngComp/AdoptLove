package br.com.backendlearning.AdoptLove.domain.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddUser {
    public String name;
    public String email;
    public String password;
    public String passwordConfirmation;
}