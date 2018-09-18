package com.design.factory.abstracts.factory;

/**
 * @author gsliu
 * @date 2018-09-18 16:04
 */
public class MaleAnimalFactory implements AnimalFactory {
    @Override
    public AbstractAnimal createDog() {
        return new MaleDog();
    }

    @Override
    public AbstractAnimal createCat() {
        return new MaleCat();
    }
}
