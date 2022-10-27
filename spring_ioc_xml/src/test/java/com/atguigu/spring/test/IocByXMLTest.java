package com.atguigu.spring.test;

import com.atguigu.spring.pojo.Clazz;
import com.atguigu.spring.pojo.Person;
import com.atguigu.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocByXMLTest {
    @Test
    public void tt() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //Student student1 = (Student) ioc.getBean("student1");
        Student student1 = (Student) ioc.getBean("student8", Person.class);
        student1.setAge(18);
        System.out.println(student1);
    }
    @Test
    public void tt2() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //Student student1 = (Student) ioc.getBean("student1");
        Clazz clazz = (Clazz) ioc.getBean("clazz2", Clazz.class);

        System.out.println(clazz);
    }
}
