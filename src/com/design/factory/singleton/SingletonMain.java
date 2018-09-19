package com.design.factory.singleton;

/**
 * @author gsliu
 * @date 2018-09-19 15:03
 */
public class SingletonMain {
    public static void main(String[] args){
        Singleton singleton = SingletonFactory.getSingleton();
        singleton.doSomething();

    }
}
