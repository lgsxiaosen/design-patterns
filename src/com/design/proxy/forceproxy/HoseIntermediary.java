package com.design.proxy.forceproxy;

/**
 * @author gsliu
 * @date 2018-09-20 16:16
 */
public class HoseIntermediary implements IRentHose {

    private IRentHose rentHose;

    public HoseIntermediary(IRentHose irentHose){
        rentHose = irentHose;
    }

    @Override
    public void rentHose() {
        rentHose.rentHose();
    }

    @Override
    public IRentHose getProxy() {
        return this;
    }
}
