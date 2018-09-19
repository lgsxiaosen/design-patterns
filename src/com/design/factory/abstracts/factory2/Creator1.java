package com.design.factory.abstracts.factory2;

/**
 * @author gsliu
 * @date 2018-09-19 14:43
 */
public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
