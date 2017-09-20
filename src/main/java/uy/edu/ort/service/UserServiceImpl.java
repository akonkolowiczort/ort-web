package uy.edu.ort.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uy.edu.ort.dao.UserDao;
import uy.edu.ort.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void addUser(User user) {
        LOGGER.info("addUser " + user.getName());
        this.userDao.addUser(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        LOGGER.info("addUser " + user.getName());
        this.userDao.update(user);
    }

    @Override
    @Transactional
    public void removeUser(User user) {
        LOGGER.info("removeUser " + user.getName());
        this.userDao.removeUser(user);
    }

    @Override
    @Transactional
    public User getUser(Long userId) {
        return this.userDao.getUser(userId);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> listUsers() {
        LOGGER.info("listUsers ");
        return this.userDao.listUsers();
    }
}
