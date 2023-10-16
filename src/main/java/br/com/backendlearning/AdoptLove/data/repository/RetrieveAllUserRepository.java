package br.com.backendlearning.AdoptLove.data.repository;

import br.com.backendlearning.AdoptLove.domain.models.UserModel;

import java.util.List;

public interface RetrieveAllUserRepository {
    List<UserModel> retrieve();
}
