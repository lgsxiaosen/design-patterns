package com.design.proxy.dynamic;

/**
 * @author gsliu
 * @date 2018-09-20 15:42
 */
public class RentHouse implements IRentHouse {
    @Override
    public void rentHouse() {
        System.out.println("租了一间房子。。。");
    }
}
