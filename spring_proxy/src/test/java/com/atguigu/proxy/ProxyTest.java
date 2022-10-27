package com.atguigu.proxy;

import com.atguigu.spring.proxy.Calculator;
import com.atguigu.spring.proxy.CalculatorImpl;
import com.atguigu.spring.proxy.CalculatorStaticProxy;
import com.atguigu.spring.proxy.ProxyFactory;
import org.junit.Test;

public class ProxyTest
{
    /**
     * 动态代理有两种：
     * 1.jdk动态代理
     * 2.cglib动态代理
     */
    @Test
    public void jj(){
//        CalculatorStaticProxy cp=new CalculatorStaticProxy(new CalculatorImpl());
//        cp.div(1,0);
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy= (Calculator) proxyFactory.getProxy();
        proxy.add(1,2);
    }
}
