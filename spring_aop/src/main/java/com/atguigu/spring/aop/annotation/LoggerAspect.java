package com.atguigu.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect //将当前组件设置为切面
public class LoggerAspect {
    @Pointcut("execution(* com.atguigu.spring.aop.annotation.CalculatorImpl.*(..))")
    public void pointCut(){}
    @Before("pointCut()")//重用切入点表达式
    //@Before("execution(* com.atguigu.spring.aop.annotation.*.*(..))")
    //@Before("execution(public int com.atguigu.spring.aop.annotation.CalculatorImpl.add(int,int))")
    public void beforeAdviseMethod(JoinPoint joinPoint) {
        System.out.println("前置通知" + joinPoint.getSignature().getName() + Arrays.toString(joinPoint.getArgs()));
    }
}
