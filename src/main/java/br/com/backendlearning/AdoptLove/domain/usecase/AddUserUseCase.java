package br.com.backendlearning.AdoptLove.domain.usecase;

import br.com.backendlearning.AdoptLove.domain.models.AddUser;

public interface AddUserUseCase {
    boolean createUser(AddUser model);
}
