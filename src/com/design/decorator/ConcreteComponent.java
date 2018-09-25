package com.design.decorator;

/**
 * @author gsliu
 * @date 2018-09-25 10:53
 */
public class ConcreteComponent implements Component {
    @Override
    public void method() {
        System.out.println("原来的方法");
    }
}
