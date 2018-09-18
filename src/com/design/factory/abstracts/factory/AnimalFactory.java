package com.design.factory.abstracts.factory;

/**
 * @author gsliu
 * @date 2018-09-18 15:53
 */
public interface AnimalFactory {
    AbstractAnimal createDog();
    AbstractAnimal createCat();

}
