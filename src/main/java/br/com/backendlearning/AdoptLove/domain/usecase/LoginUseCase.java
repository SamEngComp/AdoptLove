package br.com.backendlearning.AdoptLove.domain.usecase;

import br.com.backendlearning.AdoptLove.domain.models.LoginModel;

public interface LoginUseCase {
    boolean login(LoginModel model);
}
