package com.design.factory.lazy;

/**
 * @author gsliu
 * @date 2018-09-19 15:13
 */
public class ConcreteProduct1 extends Product{
    @Override
    public void doSomthing() {
        System.out.println("创建产品1");
    }
}
