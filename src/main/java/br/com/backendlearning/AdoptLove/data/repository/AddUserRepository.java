package br.com.backendlearning.AdoptLove.data.repository;

import br.com.backendlearning.AdoptLove.domain.models.User;

public interface AddUserRepository {
    boolean save(User user);
}
