package com.design.singleton;

/**
 * @author gsliu
 * @date 2018-09-18 9:49
 * 单例模式，实例3--------双重检查
 */
public class SingletonDemo3 {
    private static SingletonDemo3 instance;

    private SingletonDemo3() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    public static SingletonDemo3 getInstance() {
        //第一重检查，提高效率
        if (instance == null) {
            synchronized (SingletonDemo3.class) {
                //第二重检查保证线程安全
                if (instance == null) {
                    instance = new SingletonDemo3();
                }
            }
        }
        return instance;
    }

    public void print(){
        System.out.println("双重检查");
    }

}
