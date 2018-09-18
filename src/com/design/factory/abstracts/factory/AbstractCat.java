package com.design.factory.abstracts.factory;

/**
 * @author gsliu
 * @date 2018-09-18 15:45
 */
public abstract class AbstractCat extends AbstractAnimal{
    @Override
    public void howl() {
        System.out.println("猫在喵喵叫");
    }
}
