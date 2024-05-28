package org.example;


import org.example.model.User;
import org.example.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        //
        UserService userService=new UserService();
        List<User> allUsers = userService.getAllUsers();
        allUsers.stream().forEach(System.out::println);
    }
}