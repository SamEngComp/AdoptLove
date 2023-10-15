package br.com.backendlearning.AdoptLove.presentation.models;

import java.time.LocalDate;

public record SignUpFormModel(
        String name,
    // LocalDate dateBirth
        String email,
        String password,
        String passwordConfirmation) { }
