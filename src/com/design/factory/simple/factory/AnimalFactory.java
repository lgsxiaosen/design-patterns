package com.design.factory.simple.factory;

/**
 * @author gsliu
 * @date 2018-09-18 15:01
 * 创建一个动物工厂
 */
public interface AnimalFactory {
    /**
     * 获取一个动物
     * @return
     */
    AbstractAnimal createAnimal();
}
