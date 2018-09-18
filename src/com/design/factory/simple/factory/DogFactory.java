package com.design.factory.simple.factory;

/**
 * @author gsliu
 * @date 2018-09-18 15:07
 * 生产狗的工厂
 */
public class DogFactory implements AnimalFactory {
    @Override
    public AbstractAnimal createAnimal() {
        return new Dog();
    }
}
