package br.com.backendlearning.AdoptLove.domain.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LoginModel {
    private String email;
    private String password;
}