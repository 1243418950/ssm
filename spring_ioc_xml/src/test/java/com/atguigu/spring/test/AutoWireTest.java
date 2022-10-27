package com.atguigu.spring.test;

import com.atguigu.spring.Dao.UserDao;
import com.atguigu.spring.controller.UserController;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireTest {
    @Test
    public void autoWireTest(){
        ApplicationContext ioc =new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController=ioc.getBean(UserController.class);
//        UserService userService=ioc.getBean(UserService.class);
//        UserDao userDao=ioc.getBean(UserDao.class);
//        userController.setUserService(userService);
        userController.saveUser();



    }
}
