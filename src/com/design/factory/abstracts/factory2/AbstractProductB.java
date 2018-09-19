package com.design.factory.abstracts.factory2;

/**
 * @author gsliu
 * @date 2018-09-19 14:38
 */
public abstract class AbstractProductB {
    /**
     * 每个产品共有的方法
     */
    public void shareMethod(){
        System.out.println("B类产品");
    }

    /**
     * 每个产品相同方法， 不同实现
     */
    public abstract void doSomething();
}
