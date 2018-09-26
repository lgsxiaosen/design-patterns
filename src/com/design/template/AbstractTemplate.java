package com.design.template;

/**
 * @author gsliu
 * @date 2018-09-26 14:09
 * 抽象模板类
 */
public abstract class AbstractTemplate {

    protected abstract void method1();

    protected abstract void method2();

    public void method(){
        this.method1();
        this.method2();
    }

}
