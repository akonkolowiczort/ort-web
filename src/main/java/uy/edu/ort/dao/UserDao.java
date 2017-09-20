package uy.edu.ort.dao;

import uy.edu.ort.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void update(User user);

    void removeUser(User user);

    User getUser(Long userId);

    List<User> listUsers();
}
