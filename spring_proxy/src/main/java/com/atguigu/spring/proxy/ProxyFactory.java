package com.atguigu.spring.proxy;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }
    public Object getProxy(){
        /**
         * ClassLoader loader:类加载器，动态生成，指定加载动态生成的代理类的类加载器
         *Class[] interfaces：目标类所所实现的接口
         *InvocationHandler h：
         */
        ClassLoader cl= this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h=new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //proxy表示代理对象，method表示要执行的方法，args表示
                System.out.println("日志，方法："+method.getName()+",参数"+ Arrays.toString(args));
                Object result= method.invoke(target,args);
                System.out.println("日志，方法："+method.getName()+",结果"+ result);
                return result;
            }
        };
        return Proxy.newProxyInstance(cl,interfaces,h);
    }
}
