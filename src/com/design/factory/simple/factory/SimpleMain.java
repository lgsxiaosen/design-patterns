package com.design.factory.simple.factory;

/**
 * @author gsliu
 * @date 2018-09-18 15:10
 */
public class SimpleMain {

    public static void main(String[] args){
        //声明动物工厂
        Dog dog = (Dog)AnimalFactory.createAnimal(Dog.class);
        Cat cat = (Cat)AnimalFactory.createAnimal(Cat.class);

        dog.howl();
        cat.howl();


    }
}
