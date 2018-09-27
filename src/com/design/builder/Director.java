package com.design.builder;

/**
 * @author gsliu
 * @date 2018-09-27 11:00
 */
public class Director {

    public Computer createComputerByDirector(IBuildComputer computer){
        computer.buildCapacity();
        computer.buildCPU();
        computer.buildRam();
        computer.buildSystem();
        return computer.createComputer();
    }
}
