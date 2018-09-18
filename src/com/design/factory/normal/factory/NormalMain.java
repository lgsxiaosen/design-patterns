package com.design.factory.normal.factory;

/**
 * @author gsliu
 * @date 2018-09-18 15:10
 */
public class NormalMain {

    public static void main(String[] args){
        //声明动物工厂
        AnimalFactory dogFactory = new DogFactory();
        AnimalFactory catFactory = new CatFactory();

        //创建动物
        AbstractAnimal dog = dogFactory.createAnimal();
        AbstractAnimal cat = catFactory.createAnimal();

        dog.howl();
        cat.howl();


    }
}
