package com.imooc.controller;

/**
 * Created by LuoboGan
 * Date:2020/12/24
 */
// 懒汉式 调用的时候初始化对象
public class singleTon {
    // 创建私有构造
    private singleTon(){
    }
    // 私有化实例对象
    private static singleTon instance = null;
    // 对象实例化与获取方法
    public static singleTon getInstance(){
        if(instance == null){
            instance = new singleTon();
        }
        return instance;
    }


}
