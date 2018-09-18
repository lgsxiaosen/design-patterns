package com.design.factory.abstracts.factory;

/**
 * @author gsliu
 * @date 2018-09-18 15:45
 */
public abstract class AbstractDog extends AbstractAnimal{
    @Override
    public void howl() {
        System.out.println("狗在汪汪叫");
    }
}
