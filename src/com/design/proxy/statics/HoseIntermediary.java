package com.design.proxy.statics;

/**
 * @author gsliu
 * @date 2018-09-20 15:44
 */
public class HoseIntermediary implements IRentHose {

    private IRentHose rentHose;
    public HoseIntermediary(IRentHose irentHose){
        rentHose = irentHose;
    }

    @Override
    public void rentHose() {
        System.out.println("交中介费");
        rentHose.rentHose();
        System.out.println("中介负责维修管理");
    }
}
