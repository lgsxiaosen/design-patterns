package com.design.decorator;

/**
 * @author gsliu
 * @date 2018-09-25 11:01
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component){
        super(component);
    }

    public void method2(){
        System.out.println("装饰器2装饰");
    }

    @Override
    public void method(){
        System.out.println("增加装饰2包装");
        super.method();
        System.out.println("装饰2包装结束");
    }
}
