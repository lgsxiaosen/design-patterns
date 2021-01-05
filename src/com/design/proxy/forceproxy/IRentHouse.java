package com.design.proxy.forceproxy;

/**
 * @author gsliu
 * @date 2018-09-20 15:41
 */
public interface IRentHouse {
    void rentHouse();
    IRentHouse getProxy();
}
