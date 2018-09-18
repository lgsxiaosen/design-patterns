package com.design.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author gsliu
 * @date 2018-09-18 9:57
 * 单例模式扩展，固定实例
 */
public class SingletonDemo6 {
    /**
     * 最多可以生成的单例数量
     */
    private static int maxNumberSingleDemo = 3;
    /**
     * 定义列表存放实例
     */
    private static List<SingletonDemo6> singleDemoList = new ArrayList<SingletonDemo6>();

    private static List<Integer> demoNumbers = new ArrayList<Integer>();

    private static int number = 0;

    //生成对象
    static{
        for(int i=0; i<maxNumberSingleDemo; i++){
            singleDemoList.add(new SingletonDemo6(i+1));
        }
    }

    private SingletonDemo6(){}

    private SingletonDemo6(int demoNumber){
        demoNumbers.add(demoNumber);
    }

    public static SingletonDemo6 getInstance(){
        Random random = new Random();
        //随机调用一个实例
        number = random.nextInt(maxNumberSingleDemo);
        return singleDemoList.get(number);
    }

    public void print(){
        System.out.println("第" + demoNumbers.get(number).toString() + "个实例");
    }


}
