package com.design.proxy.statics;

/**
 * @author gsliu
 * @date 2018-09-20 15:47
 */
public class Main {

    public static void main(String[] args){
        //定义租房
        IRentHose rentHose = new RentHose();
        //定义中介
        IRentHose intermediary = new HoseIntermediary(rentHose);
        //中介租房
        intermediary.rentHose();
    }
}
