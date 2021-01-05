package com.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author gsliu
 * @date 2018-09-20 16:49
 */
public class Main {

    public static void main(String[] args){

        IRentHouse rentHouse = new RentHouse();
        //定义一个handler
        InvocationHandler handler = new IntermediaryProxy(rentHouse);
        //获得类的class loader
        ClassLoader cl = rentHouse.getClass().getClassLoader();
        //动态产生一个代理者
        IRentHouse proxy = (IRentHouse) Proxy.newProxyInstance(cl, new Class[]{IRentHouse.class}, handler);
        proxy.rentHouse();

        ISellHouse sellHouse = new SellHouse();
        InvocationHandler handler1 = new IntermediaryProxy(sellHouse);
        ClassLoader classLoader = sellHouse.getClass().getClassLoader();
        ISellHouse proxy1 = (ISellHouse) Proxy.newProxyInstance(classLoader, new Class[]{ISellHouse.class}, handler1);
        proxy1.sellHouse();

    }
}
