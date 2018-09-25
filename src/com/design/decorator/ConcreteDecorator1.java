package com.design.decorator;

/**
 * @author gsliu
 * @date 2018-09-25 10:57
 */
public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component component){
        super(component);
    }

    public void method1(){
        System.out.println("装饰器1装饰");
    }

    @Override
    public void method(){
        System.out.println("增加装饰1包装");
        super.method();
        System.out.println("装饰1包装结束");
    }
}
