package com.wuxk.dateCalculate.service.userService;

import com.wuxk.dateCalculate.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {

    void addUser(User user);

    void deleteUser(User user);

    void modifyUser(User user);

    List<User> queryUser(User user);
}
