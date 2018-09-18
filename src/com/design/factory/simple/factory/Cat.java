package com.design.factory.simple.factory;

/**
 * @author gsliu
 * @date 2018-09-18 15:05
 */
public class Cat extends AbstractAnimal {
    @Override
    public void howl() {
        System.out.println("猫在喵喵叫");
    }
}
