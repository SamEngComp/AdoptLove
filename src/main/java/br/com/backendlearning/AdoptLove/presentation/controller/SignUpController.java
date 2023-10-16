package br.com.backendlearning.AdoptLove.presentation.controller;

import br.com.backendlearning.AdoptLove.data.usecase.DbAddUser;
import br.com.backendlearning.AdoptLove.domain.models.AddUser;
import br.com.backendlearning.AdoptLove.domain.usecase.AddUserUseCase;
import br.com.backendlearning.AdoptLove.infra.repository.AddUserPostgresRepository;
import br.com.backendlearning.AdoptLove.presentation.models.SignUpFormModel;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign-up")
public class SignUpController {

    @Autowired
    private AddUserUseCase useCase;

    @PostMapping
    @Transactional
    public void createUser(@RequestBody SignUpFormModel model) {
        useCase.createUser(makeAddUser(model));
    }

    private AddUser makeAddUser(SignUpFormModel model) {
        return new AddUser(model.name(),
                model.email(),
                model.password(),
                model.passwordConfirmation());
    }

}
