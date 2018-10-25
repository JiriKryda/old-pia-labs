package org.danekja.edu.pia.dao.jpa;

import javax.persistence.EntityManager;

import org.danekja.edu.pia.dao.UserDao;
import org.danekja.edu.pia.domain.User;

/**
 * JPA implementation of the UserDao interface
 *
 * Date: 26.9.15
 *
 * @author Jakub Danek
 */
public class UserDaoJPQL extends GenericDaoJpa<User, String> implements UserDao {

    /**
     *
     * @param em entity manager to be used by this dao
     */
    public UserDaoJPQL(EntityManager em) {
        super(em, User.class);
    }

    @Override
    public User create(User user) {
        entityManager.persist(user);
        return user;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }
}
