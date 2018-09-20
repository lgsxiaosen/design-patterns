package com.design.proxy.forceproxy;

/**
 * @author gsliu
 * @date 2018-09-20 16:16
 */
public class IntermediaryProxy implements IRentHose {

    private IRentHose rentHose;

    public IntermediaryProxy(IRentHose irentHose){
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
