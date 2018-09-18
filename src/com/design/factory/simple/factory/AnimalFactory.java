package com.design.factory.simple.factory;

/**
 * @author gsliu
 * @date 2018-09-18 15:01
 * 创建一个动物工厂
 */
public class AnimalFactory {
    public static Object createAnimal(Class<? extends Animal> clazz){
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;

    }
}
