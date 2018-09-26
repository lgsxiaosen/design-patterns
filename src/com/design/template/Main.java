package com.design.template;

/**
 * @author gsliu
 * @date 2018-09-26 14:14
 */
public class Main {

    public static void main(String[] args){

        AbstractTemplate template1 = new ConcreteTemplate1();
        AbstractTemplate template2 = new ConcreteTemplate2();
        template1.method();
        System.out.println("-----------------");
        template2.method();

    }
}
