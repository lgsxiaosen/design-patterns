package com.design.factory.simple.factory;

/**
 * @author gsliu
 * @date 2018-09-18 15:04
 */
public class Dog extends AbstractAnimal {
    @Override
    public void howl() {
        System.out.println("狗在汪汪叫");
    }
}
