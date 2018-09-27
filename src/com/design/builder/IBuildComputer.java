package com.design.builder;

/**
 * @author gsliu
 * @date 2018-09-27 10:52
 * 创建电脑的接口
 */
public interface IBuildComputer {
    void buildCPU();

    void buildCapacity();

    void buildRam();

    void buildSystem();

    Computer createComputer();
}
