package com.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author gsliu
 * @date 2018-09-20 16:49
 */
public class Main {

    public static void main(String[] args){

        IRentHose rentHose = new RentHose();
        //定义一个handler
        InvocationHandler handler = new IntermediaryProxy(rentHose);
        //获得类的class loader
        ClassLoader cl = rentHose.getClass().getClassLoader();
        //动态产生一个代理者
        IRentHose proxy = (IRentHose) Proxy.newProxyInstance(cl, new Class[]{IRentHose.class}, handler);
        proxy.rentHose();
    }
}
