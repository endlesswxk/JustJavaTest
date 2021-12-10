package com.wuxk.dateCalculate.service.userService;

import com.wuxk.dateCalculate.entity.User;
import com.wuxk.dateCalculate.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    /**
     * 对用户的逻辑删除 deleteUser
     *
     * @param user user
     */
    @Override
    public void deleteUser(User user) {
        userMapper.deleteUser(user);
    }

    @Override
    public void modifyUser(User user) {
        userMapper.modifyUser(user);
    }

    @Override
    public List<User> queryUser(User user) {
        return userMapper.queryUser(user);
    }
}
