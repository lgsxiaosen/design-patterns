package com.design.factory.abstracts.factory;

/**
 * @author gsliu
 * @date 2018-09-18 15:55
 */
public class FemaleAnimalFactory implements AnimalFactory{
    @Override
    public AbstractAnimal createDog() {
        return new FemaleDog();
    }

    @Override
    public AbstractAnimal createCat() {
        return new FemaleCat();
    }
}
