package br.com.backendlearning.AdoptLove.infra.repository;

import br.com.backendlearning.AdoptLove.data.repository.AddUserRepository;
import br.com.backendlearning.AdoptLove.domain.models.User;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddUserPostgresRepository implements AddUserRepository {

    @Autowired
    private EntityManager entityManager;

    public AddUserPostgresRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public boolean save(User user) {
        System.out.println(user);
        entityManager.persist(user);
        return true;
    }
}
