package com.allen.dao;

import com.allen.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("insert into user (userName, userAccount, userPassword, sex)" +
            "       values (#{userName}, #{userAccount}, #{userPassword}, #{sex})")
    int addUser(User user);

    @Delete("delete from user where userID = #{userID}")
    int deleteUser(int id);

    @Update("update user" +
            "            set userName=#{userName}, userAccount=#{userAccount}, " +
            "                userPassword=#{userPassword}, sex=#{sex} " +
            "            where userID=#{userID} or userAccount=#{userAccount}")
    int updateUser(User user);

    @Select("select * from user where userID=#{userID}")
    User queryUserByID(int id);

    @Select("select * from user")
    List<User> queryAllUser();
}
