package com.design.decorator;

/**
 * @author gsliu
 * @date 2018-09-25 11:02
 */
public class Main {


    public static void main(String[] args){

        //原来对象
        Component component = new ConcreteComponent();
        component.method();

        System.out.println("-------------------------");
        //被装饰1修饰
        ConcreteDecorator1 component1 = new ConcreteDecorator1(component);
        component1.method1();
        component1.method();
        System.out.println("-------------------------");
        //被装饰2修饰
        ConcreteDecorator2 component2 = new ConcreteDecorator2(component);
        component2.method2();
        component2.method();
        System.out.println("-------------------------");
        //多重装饰
        Component component3 = new ConcreteDecorator2(new ConcreteDecorator1(new ConcreteComponent()));
        component3.method();
        System.out.println("-------------------------");
        Component component4 = new ConcreteDecorator1(new ConcreteDecorator2(new ConcreteComponent()));
        component4.method();


    }
}
