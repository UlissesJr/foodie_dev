package com.imooc.enums;

/**
 * Created by LuoboGan
 * Date:2020/12/18
 * @ Desc: 性别 枚举
 */
public enum Sex {

    women(0,"女"),
    man(1,"男"),
    secret(2,"保密");

    public final Integer type;
    public final String value;

    Sex(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
