package com.wuxk.dateCalculate.mapper;

import com.wuxk.dateCalculate.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 新增用户
     *
     * @param user
     */
     void addUser(User user);

    /**
     * 删除用户
     *
     * @param user
     */
    void deleteUser(User user);


    /**
     * 更新用户
     *
     * @param user
     */
    void modifyUser(User user);

    /**
     * 批量查询用户
     *
     * @param user user
     * @return users
     */
     List<User> queryUser(User user);
}
