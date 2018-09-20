package com.design.proxy.forceproxy;

/**
 * @author gsliu
 * @date 2018-09-20 16:25
 */
public class Main {

    public static void main(String[] args){

        IRentHose iRentHose = new LandLord();
        //租客找房东租房
        iRentHose.rentHose();
        //找中介租房
        IRentHose rentHose = iRentHose.getProxy();
        rentHose.rentHose();


    }

}
