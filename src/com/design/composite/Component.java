package com.design.composite;

/**
 * @author gsliu
 * @date 2018-09-26 9:35
 * 一个抽象构件，声明一个接口用于访问和管理Component的子部件
 */
public abstract class Component {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    abstract void add(Component component);

    abstract void delete(Component component);

    abstract void show(int index);

}
