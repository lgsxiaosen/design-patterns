package com.design.template;

/**
 * @author gsliu
 * @date 2018-09-26 14:13
 */
public class ConcreteTemplate2 extends AbstractTemplate {
    @Override
    protected void method1() {
        System.out.println("模板2业务逻辑方法1");
    }

    @Override
    protected void method2() {
        System.out.println("模板2业务逻辑方法2");
    }
}
