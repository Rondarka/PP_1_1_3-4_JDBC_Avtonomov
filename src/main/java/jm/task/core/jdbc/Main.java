package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;

public class Main {


    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("nam1", "name1", (byte) 1);
        userService.saveUser("nam2", "name2", (byte) 2);
        userService.saveUser("nam3", "name3", (byte) 3);
        userService.saveUser("nam4", "name4", (byte) 4);

        userService.removeUserById(1);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
