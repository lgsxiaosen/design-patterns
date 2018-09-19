package com.design.factory.abstracts.factory2;

/**
 * @author gsliu
 * @date 2018-09-19 14:44
 */
public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
