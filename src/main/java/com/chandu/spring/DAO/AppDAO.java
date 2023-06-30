package com.chandu.spring.DAO;

import com.chandu.spring.model.User;
import java.util.List;

public interface AppDAO {

    List<User> listUsers();

    void addUser(User user);
}
