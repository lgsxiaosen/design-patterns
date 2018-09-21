package com.design.proxy.dynamic;

/**
 * @author gsliu
 * @date 2018-09-21 10:00
 */
public class SellHose implements ISellHose {
    @Override
    public void sellHose() {
        System.out.println("买了一间房子。。。");
    }
}
