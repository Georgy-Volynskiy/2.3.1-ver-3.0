package web.dao;

import web.model.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserDAO {
    List<User> allUsers();
    void add(User user);
    void remove(User user);
    void edit(User user);
    User getById(int id);
}