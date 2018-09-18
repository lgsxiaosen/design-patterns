package com.design.singleton;

/**
 * @author gsliu
 * @date 2018-09-18 9:51
 * 单例模式，实例4--------静态内部类
 */
public class SingletonDemo4 {
    private static SingletonDemo4 instance;

    private static class SingletonDemo4Holder {
        private static final SingletonDemo4 instance = new SingletonDemo4();
    }

    private SingletonDemo4() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    /**
     * 调用这个方法的时候，JVM才加载静态内部类，才初始化静态内部类的类变量。由于由JVM初始化，保证了线程安全性，
     * 同时又实现了懒加载
     */
    public static SingletonDemo4 getInstance() {
        return SingletonDemo4Holder.instance;
    }

    public void print(){
        System.out.println("静态内部类");
    }
}
