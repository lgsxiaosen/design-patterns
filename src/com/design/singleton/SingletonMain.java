package com.design.singleton;

/**
 * @author gsliu
 * @date 2018-09-18 9:55
 * 单例模式测试
 */
public class SingletonMain {

    public static void main(String[] args){
        SingletonDemo1.getInstance().print();
        SingletonDemo2.getInstance().print();
        SingletonDemo3.getInstance().print();
        SingletonDemo4.getInstance().print();
        SingletonDemo5.INSTANCE.print();

        for (int i=0; i<5; i++){
            SingletonDemo6.getInstance().print();
        }
    }

}
