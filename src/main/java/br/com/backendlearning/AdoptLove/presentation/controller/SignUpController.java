package br.com.backendlearning.AdoptLove.presentation.controller;

import br.com.backendlearning.AdoptLove.presentation.models.SignUpFormModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign-up")
public class SignUpController {

    @PostMapping
    public void createUser(@RequestBody SignUpFormModel model) {
        System.out.println(model);
    }

}
