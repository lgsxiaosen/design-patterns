package com.design.factory.abstracts.factory;

/**
 * @author gsliu
 * @date 2018-09-18 16:05
 */
public class AbstractMain {

    public static void main(String[] args){
        AnimalFactory am = new MaleAnimalFactory();
        MaleCat maleCat = (MaleCat)am.createCat();
        MaleDog maleDog = (MaleDog) am.createDog();
        maleCat.howl();
        maleCat.gender();
        maleDog.howl();
        maleDog.gender();
        AnimalFactory af = new FemaleAnimalFactory();
        FemaleCat femaleCat = (FemaleCat) af.createCat();
        FemaleDog femaleDog = (FemaleDog) af.createDog();
        femaleCat.howl();
        femaleCat.gender();
        femaleDog.howl();
        femaleDog.gender();

    }


}
