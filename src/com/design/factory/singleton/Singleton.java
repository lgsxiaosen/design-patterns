package com.design.factory.singleton;

/**
 * @author gsliu
 * @date 2018-09-19 15:00
 */
public class Singleton {
    private Singleton(){}

    public void doSomething(){
        System.out.println("工厂方法创建的单例模式");
    }

}
