package org.example.userConnection;

import org.example.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserRepository {

    List<User> getAllUsers() throws SQLException;

    User getUserWithId(String iD);
}
