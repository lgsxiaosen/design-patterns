package com.design.builder;

/**
 * @author gsliu
 * @date 2018-09-27 10:55
 */
public class HPComputer implements IBuildComputer {
    private Computer computer;

    public HPComputer(){
        computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("惠普cpu");
    }

    @Override
    public void buildCapacity() {
        computer.setCapacity("560G");
    }

    @Override
    public void buildRam() {
        computer.setRam("16G");
    }

    @Override
    public void buildSystem() {
        computer.setSystem("windows10");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
