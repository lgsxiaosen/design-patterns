package com.design.factory.abstracts.factory2;

/**
 * @author gsliu
 * @date 2018-09-19 14:39
 */
public abstract class AbstractCreator {
    /**
     * 创建A产品家族
     * @return
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建B产品家族
     * @return
     */
    public abstract AbstractProductB createProductB();

}
