package com.design.proxy.forceproxy;


/**
 * @author gsliu
 * @date 2018-09-20 15:42
 */
public class LandLord implements IRentHose {

    private IRentHose iRentHose = null;

    @Override
    public void rentHose() {
        if (isProxy()){
            System.out.println("租了一间房子。。。");
        }else {
            System.out.println("请找中介");
        }
    }

    @Override
    public IRentHose getProxy() {
        iRentHose = new HoseIntermediary(this);
        return iRentHose;
    }

    /**
     * 校验是否是代理访问
     * @return
     */
    private boolean isProxy(){
        if(this.iRentHose == null){
            return false;
        }else{
            return true;
        }
    }
}
