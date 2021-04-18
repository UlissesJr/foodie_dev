package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by LuoboGan
 * Date:2020/12/6
 */
//启动类
@SpringBootApplication
// 扫描 mybatis 通用 mapper 所在包
@MapperScan(basePackages = "com.imooc.mapper")
// 扫描 所有包以及相关组件包
@ComponentScan(basePackages = {"com.imooc","org.n3r.idworker"})
@EnableTransactionManagement
public class Application {
    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);
    }
}
