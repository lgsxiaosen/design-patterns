package com.design.proxy.statics;

/**
 * @author gsliu
 * @date 2018-09-20 15:42
 */
public class RentHose implements IRentHose {
    @Override
    public void rentHose() {
        System.out.println("租了一间房子。。。");
    }
}
