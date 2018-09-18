package com.design.singleton;

/**
 * @author gsliu
 * @date 2018-09-18 9:53
 * 单例模式，实例5--------枚举类
 */
public enum SingletonDemo5 {

    INSTANCE;

    public void print(){
        System.out.println("枚举类");
    }
}
