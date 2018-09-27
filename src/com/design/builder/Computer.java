package com.design.builder;

/**
 * @author gsliu
 * @date 2018-09-27 10:49
 */
public class Computer {

    private String CPU;

    private String capacity;

    private String ram;

    private String system;

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", capacity='" + capacity + '\'' +
                ", ram='" + ram + '\'' +
                ", system='" + system + '\'' +
                '}';
    }
}
