package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UserMapper {
    /**
     * 根据用户名查找对应的用户
     * @param username
     * @return User
     */
    User getUserByUserName(String username);

    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username,String password);

    /**
     * 使用map验证登录
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String,Object> map);

    /**
     * 添加用户信息
     * @param user
     */
    void insertUser(User user);

    /**
     * 使用注解自定义属性名
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username2") String username, @Param("password") String password);

}
