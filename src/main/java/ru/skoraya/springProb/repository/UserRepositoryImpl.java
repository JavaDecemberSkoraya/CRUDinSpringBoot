package ru.skoraya.springProb.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.skoraya.springProb.model.User;

import java.util.List;


@Repository
public class UserRepositoryImpl implements UserRepository{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<User> getAllUsers() {
        List<User> users = null;
        users = entityManager.createQuery("FROM User", User.class).getResultList();
        users.forEach(user -> System.out.println(user.getFirstname()));
        return users;
    }

    @Override
    public void createUser(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    @Override
    public User readUser(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
        entityManager.flush();
    }

    @Override
    public void deleteUser(Long id) {
        User user = readUser(id);
        if (user != null){
            entityManager.remove(user);
            entityManager.flush();
        }else {
            throw new NullPointerException("User not found");
        }
    }
}
