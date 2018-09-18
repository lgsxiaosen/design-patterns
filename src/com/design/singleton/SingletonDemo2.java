package com.design.singleton;

/**
 * @author gsliu
 * @date 2018-09-18 9:45
 * 单例模式，实例2--------懒汉模式
 */
public class SingletonDemo2 {
    /**
     * 此处并不初始化实例
     */
    private static SingletonDemo2 instance;

    private SingletonDemo2() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }
    /**
     * 当调用此方法的时候才初始化实例， 为了实现线程安全，需要使用同步方法
     */
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }

    public void print(){
        System.out.println("懒汉模式");
    }


}
