package web.dao;

import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Component
public class UserDAOImpl implements UserDAO {

    private final EntityManager em;

    @Autowired
    public UserDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public List allUsers() {
        return em.createQuery("from User").getResultList();
    }

    @Override
    @Transactional
    public void add(User user) {
        em.persist(user);
    }

    @Override
    @Transactional
    public void remove(User user) {
        em.remove(em.contains(user) ? user : em.merge(user));
    }

    @Override
    @Transactional
    public void edit(User user) {
        em.merge(user);
    }

    @Override
    @Transactional
    public User getById(int id) {
        return em.find(User.class, id);
    }
}
