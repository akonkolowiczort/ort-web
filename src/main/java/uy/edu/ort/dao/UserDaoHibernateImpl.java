package uy.edu.ort.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import uy.edu.ort.model.User;

@Repository
public class UserDaoHibernateImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addUser(User user) {
        this.sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void update(User user) {
        User userDb = this.getUser(user.getId());
        userDb.setCode(user.getCode());
        userDb.setName(user.getName());

        this.sessionFactory.getCurrentSession().saveOrUpdate(userDb);
    }

    @Override
    public void removeUser(User user) {
        this.sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    public User getUser(Long userId) {
        return (User) this.sessionFactory.getCurrentSession().get(User.class, userId);
    }

    @Override
    public List<User> listUsers() {
        Query query = this.sessionFactory.getCurrentSession().createQuery("select u from User u");
        return query.list();
    }
}
