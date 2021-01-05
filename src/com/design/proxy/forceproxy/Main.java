package com.design.proxy.forceproxy;

/**
 * @author gsliu
 * @date 2018-09-20 16:25
 */
public class Main {

    public static void main(String[] args){

        IRentHouse iRentHouse = new LandLord();
        //租客找房东租房
        iRentHouse.rentHouse();
        //找中介租房
        IRentHouse rentHouse = iRentHouse.getProxy();
        rentHouse.rentHouse();


    }

}
