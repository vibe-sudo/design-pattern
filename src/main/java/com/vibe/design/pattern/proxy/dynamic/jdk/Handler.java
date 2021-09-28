package com.vibe.design.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: JDK动态代理方法日志切入
 * @author: vibe
 * @create: 2021-09-28 11:16
 **/
public class Handler<T> implements InvocationHandler{

    private T target;


    public Handler(T target){
        this.target = target;
    }

    public void before(){
        System.out.println("jdk : 方法执行前log");
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target,args);
        after();
        System.out.println(target.getClass() + " 父类为: " + target.getClass().getSuperclass());
        return result;
    }

    public void after(){
        System.out.println("jdk : 方法执行后log");
    }

    public T getInstance(){
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

}
