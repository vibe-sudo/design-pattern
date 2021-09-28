package com.vibe.design.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: cglib动态代理方法日志切
 * @author: vibe
 * @create: 2021-09-28 11:45
 **/
public class Handler<T> implements MethodInterceptor{

    private T target;
    private Enhancer enhancer;

    public Handler(T target){
        this.target = target;
        enhancer = new Enhancer();
    }

    public void before(){
        System.out.println("cglib : 方法执行前log");
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        System.out.println(o.getClass() + " 父类为 ：" + o.getClass().getSuperclass());
        return result;
    }

    public void after(){
        System.out.println("cglib : 方法执行后log");
    }

    public T getInstance(){
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T)enhancer.create();
    }

}
