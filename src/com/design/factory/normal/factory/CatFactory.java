package com.design.factory.normal.factory;

/**
 * @author gsliu
 * @date 2018-09-18 15:09
 * 生产猫的工厂
 */
public class CatFactory implements AnimalFactory {
    @Override
    public AbstractAnimal createAnimal() {
        return new Cat();
    }
}
