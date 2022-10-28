package com.atguigu.spring.test;

import com.atguigu.spring.aop.annotation.Calculator;
import com.atguigu.spring.aop.annotation.LoggerAspect;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    public void test1(){
        ApplicationContext ioc=new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.add(1,2);
    }
}
