package br.com.backendlearning.AdoptLove.presentation.controller;

import br.com.backendlearning.AdoptLove.presentation.models.LoginFormModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    public void loginUser(@RequestBody LoginFormModel model) {
        System.out.println(model);
    }

}
