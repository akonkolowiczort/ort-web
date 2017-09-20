package uy.edu.ort.service;

import uy.edu.ort.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    
    void update(User user);

    void removeUser(User user);

    User getUser(Long userId);

    List<User> listUsers();
}
