package br.com.backendlearning.AdoptLove.presentation.controller;

import br.com.backendlearning.AdoptLove.domain.models.LoginModel;
import br.com.backendlearning.AdoptLove.domain.usecase.LoginUseCase;
import br.com.backendlearning.AdoptLove.presentation.models.LoginFormModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginUseCase useCase;

    @PostMapping
    public void loginUser(@RequestBody LoginFormModel model) {
        useCase.login(makeLoginModel(model));
    }

    private LoginModel makeLoginModel(LoginFormModel model) {
        return new LoginModel(model.email(), model.password());
    }

}
