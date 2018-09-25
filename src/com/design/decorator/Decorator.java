package com.design.decorator;

/**
 * @author gsliu
 * @date 2018-09-25 10:55
 */
public abstract class Decorator implements Component{

    private Component component;

    public Decorator(Component component){
        super();
        this.component = component;
    }

    @Override
    public void method() {
        component.method();
    }
}
