package com.phr.test;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.FactoryBean;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
public class MyFactoryBean implements FactoryBean , InvocationHandler {
    Class clazz;
    public MyFactoryBean(Class clazz){
        this.clazz = clazz;
    }
    @Override
    public Object getObject() throws Exception {
        Class[] clazzs = new Class[]{clazz};
        Object proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(),clazzs,this);
        return proxy;
    }

    @Override
    public Class<?> getObjectType() {
        return clazz;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy");
        Method method1 = proxy.getClass().getInterfaces()[0].getMethod(method.getName());
        Annotation[] select = method1.getDeclaredAnnotations();
        System.out.println(select[0]);
        return null;
    }
}
