package com.atguigu.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect //将当前组件设置为切面
public class LoggerAspect {

    @Before("execution(public int com.atguigu.spring.aop.annotation.CalculatorImpl.add(int,int))")
    public void beforeAdviseMethod(){
        System.out.println("前置通知");
    }
}
