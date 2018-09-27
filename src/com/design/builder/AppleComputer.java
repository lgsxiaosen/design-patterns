package com.design.builder;

/**
 * @author gsliu
 * @date 2018-09-27 10:58
 */
public class AppleComputer implements IBuildComputer {
    private Computer computer;

    public AppleComputer(){
        computer = new Computer();
    }

    @Override
    public void buildCPU() {
        computer.setCPU("苹果cpu");
    }

    @Override
    public void buildCapacity() {
        computer.setCapacity("256G");
    }

    @Override
    public void buildRam() {
        computer.setRam("16G");
    }

    @Override
    public void buildSystem() {
        computer.setSystem("macOS");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
