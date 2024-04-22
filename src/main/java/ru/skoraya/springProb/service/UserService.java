package ru.skoraya.springProb.service;


import ru.skoraya.springProb.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User readUser(Long id);
    void createUser(User user);
    void UpdateUser(User user);
    void deleteUser(Long id);
}
