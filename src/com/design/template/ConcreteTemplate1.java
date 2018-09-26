package com.design.template;

/**
 * @author gsliu
 * @date 2018-09-26 14:12
 */
public class ConcreteTemplate1 extends AbstractTemplate {
    @Override
    protected void method1() {
        System.out.println("模板1业务逻辑方法1");
}

    @Override
    protected void method2() {
        System.out.println("模板1业务逻辑方法2");
    }
}
