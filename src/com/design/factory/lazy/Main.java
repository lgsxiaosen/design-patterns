package com.design.factory.lazy;

/**
 * @author gsliu
 * @date 2018-09-19 15:16
 */
public class Main {

    public static void main(String[] args) throws Exception{

        ConcreteProduct1 product1 = (ConcreteProduct1) ProductFactory.createProduct("Product1");
        product1.doSomthing();

    }

}
