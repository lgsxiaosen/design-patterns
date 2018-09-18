package com.design.singleton;

/**
 * @author gsliu
 * @date 2018-09-18 9:41
 * 单例模式，实例1--------饿汉模式
 */
public class SingletonDemo1 {
    private static SingletonDemo1 singletonDemo1 = new SingletonDemo1();

    /**
     * 私有化构造器
     */
    private SingletonDemo1(){
        //防止其他通过反射调用构造方法，破解单例
        if (singletonDemo1 != null) {
            throw new RuntimeException();
        }
    }

    /**
     * 对外提供统一的访问点
     * @return
     */
    public static SingletonDemo1 getInstance() {
        return singletonDemo1;
    }

    public void print(){
        System.out.println("懒汉模式");
    }





}
