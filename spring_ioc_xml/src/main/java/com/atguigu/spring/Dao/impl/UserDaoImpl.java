package com.atguigu.spring.Dao.impl;

import com.atguigu.spring.Dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
