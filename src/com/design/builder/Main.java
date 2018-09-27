package com.design.builder;

/**
 * @author gsliu
 * @date 2018-09-27 11:02
 */
public class Main {
    public static void main(String[] args){

        Director director = new Director();
        Computer hp = director.createComputerByDirector(new HPComputer());
        System.out.println(hp.toString());
        System.out.println("-----------------------");
        Computer apple = director.createComputerByDirector(new AppleComputer());
        System.out.println(apple.toString());
    }
}
