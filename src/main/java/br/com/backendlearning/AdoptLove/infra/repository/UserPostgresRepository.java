package br.com.backendlearning.AdoptLove.infra.repository;

import br.com.backendlearning.AdoptLove.data.repository.AddUserRepository;
import br.com.backendlearning.AdoptLove.data.repository.RetrieveAllUserRepository;
import br.com.backendlearning.AdoptLove.domain.models.LoginModel;
import br.com.backendlearning.AdoptLove.domain.models.UserModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserPostgresRepository
        implements AddUserRepository, RetrieveAllUserRepository {

    @Autowired
    private EntityManager entityManager;

    public UserPostgresRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public boolean save(UserModel user) {
        entityManager.persist(user);
        return true;
    }

    @Override
    public List<UserModel> retrieve() {
        TypedQuery<UserModel> query = entityManager.createQuery("SELECT u FROM Users u", UserModel.class);
        return query.getResultList();
    }
}
