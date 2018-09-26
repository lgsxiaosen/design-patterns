package com.design.composite;

/**
 * @author gsliu
 * @date 2018-09-26 9:46
 */
public class Main {

    public static void main(String[] args){

        Composite root = new Composite("root");
        root.add(new Leaf("leaf1"));
        Leaf leaf = new Leaf("leaf2");
        root.add(leaf);

        Composite composite = new Composite("composite");
        composite.add(new Leaf("leaf3"));
        composite.add(new Leaf("leaf4"));
        composite.add(new Leaf("leaf5"));
        root.add(composite);

        root.show(1);
        System.out.println("===================");
        root.delete(leaf);
        root.show(1);
        System.out.println("===================");
        composite.show(1);


    }
}
