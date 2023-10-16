package br.com.backendlearning.AdoptLove.domain.usecase;

import br.com.backendlearning.AdoptLove.domain.models.AddUserModel;

public interface AddUserUseCase {
    boolean createUser(AddUserModel model);
}
