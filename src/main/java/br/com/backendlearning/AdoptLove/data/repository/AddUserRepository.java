package br.com.backendlearning.AdoptLove.data.repository;

import br.com.backendlearning.AdoptLove.domain.models.UserModel;

public interface AddUserRepository {
    boolean save(UserModel user);
}
