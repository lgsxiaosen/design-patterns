package com.design.factory.singleton;

import java.lang.reflect.Constructor;

/**
 * @author gsliu
 * @date 2018-09-19 15:01
 */
public class SingletonFactory {
    private static Singleton singleton;
    static{
        try {
            Class cl= Class.forName(Singleton.class.getName());
            //获得无参构造
            Constructor constructor=cl.getDeclaredConstructor();
            //设置无参构造是可访问的
            constructor.setAccessible(true);
            //产生一个实例对象
            singleton = (Singleton)constructor.newInstance();
        } catch (Exception e) {
            //异常处理
            System.out.println("异常");
        }
    }
    public static Singleton getSingleton(){
        return singleton;
    }

}
