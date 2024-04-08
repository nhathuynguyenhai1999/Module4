package com.codegym.module4.springusertutorial.DAO;
import com.codegym.module4.springusertutorial.Model.Login;
import com.codegym.module4.springusertutorial.Model.User;
import java.util.List;
import java.util.ArrayList;
public class UserDAO {
    private static final List<User> users;
    static {
        users = new ArrayList<>();
        users.add(new User("john", "123456", "John", "john@codegym.vn", 18));
        users.add(new User("bill", "123456", "Bill", "bill@codegym.vn", 20));
        users.add(new User("mike", "123456", "Mike", "mike@codegym.vn", 22));
    }
    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount())
                    && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
