package com.design.proxy.statics;

/**
 * @author gsliu
 * @date 2018-09-20 15:47
 */
public class Main {

    public static void main(String[] args){
        IRentHose rentHose = new RentHose();
        IRentHose intermediary = new HoseIntermediary(rentHose);
        intermediary.rentHose();
    }
}
