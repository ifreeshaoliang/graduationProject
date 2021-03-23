package com.allen.service;

import com.allen.pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    int deleteUser(int id);
    int updateUser(User user);
    User queryUserByID(int id);
    User queryUserByAccountPassword(String userAccount, String userPassword);
    List<User> queryAllUser();
}
