package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ParameterTest {
    @Test
    public void testGetUserByUserName() throws IOException {
        SqlSession ss= SqlSessionUtils.getSqlSession("mybatis-config.xml",true);
        UserMapper mapper=ss.getMapper(UserMapper.class);
        User u=mapper.getUserByUserName("root");
        System.out.println(u.getUsername());
    }
    @Test
    public void testCheckLogin() throws IOException {
        SqlSession ss= SqlSessionUtils.getSqlSession("mybatis-config.xml",true);
        UserMapper mapper=ss.getMapper(UserMapper.class);
        User u=mapper.checkLogin("root","242234");
        System.out.println(u.getUsername());
    }
    @Test
    public void checkLoginByMap() throws IOException {
        SqlSession ss= SqlSessionUtils.getSqlSession("mybatis-config.xml",true);
        UserMapper mapper=ss.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("username","root");map.put("password",242234);
        User u=mapper.checkLoginByMap(map);
        System.out.println(u.getUsername());
    }
    @Test
    public void insertUser() throws IOException {
        SqlSession ss= SqlSessionUtils.getSqlSession("mybatis-config.xml",true);
        UserMapper mapper=ss.getMapper(UserMapper.class);
        User u=new User(null,"root2","123456",33,"女","234234");
        mapper.insertUser(u);
        System.out.println(u.getUsername());
    }
    @Test
    public void checkLoginByParam() throws IOException {
        SqlSession ss= SqlSessionUtils.getSqlSession("mybatis-config.xml",true);
        UserMapper mapper=ss.getMapper(UserMapper.class);
        User u=new User(null,"root2","123456",33,"女","234234");
        mapper.checkLoginByParam("root2","123456");
        System.out.println(u);
    }
}
