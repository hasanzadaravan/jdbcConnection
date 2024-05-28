package org.example.service;

import org.example.connection.DatabaseUtil;
import org.example.model.User;
import org.example.userConnection.UserRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserService implements UserRepository {
    Connection connection = DatabaseUtil.getConnection();

    @Override
    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();

        Statement statement = connection.createStatement();
        String sql = "select * from users where ";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            User user = new User(resultSet.getString("ad"), resultSet.getString("soyad"), resultSet.getString("fin"), resultSet.getString("maas"));
            users.add(user);
        }
        return users;
    }

    @Override
    public User getUserWithId(String iD) {
        return null;
    }
}
