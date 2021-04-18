package com.imooc.controller;

import com.imooc.pojo.bo.UserBO;
import com.imooc.service.UserService;
import com.imooc.utils.JSONResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by LuoboGan
 * Date:2020/12/6
 */
@RestController
@RequestMapping("passport")
public class PassportController {

    @Autowired
    private UserService userService;

    @GetMapping("/usernameIsExist")
    public JSONResult usernameIsExist(@RequestParam String username){
        //判断用户名不能为空
        if(StringUtils.isBlank(username)){
            return JSONResult.errorMsg("用户名不能为空");
        }

        //2.查找注册的用户名是否存在
        boolean isExist = userService.queryUsernameIsExist(username);
        if(isExist){
            return JSONResult.errorMsg("用户名已经存在");
        }

        //3.请求成功，用户名没有重复
        return JSONResult.ok();

    }
    @PostMapping("/regist")
    public JSONResult regist(@RequestBody UserBO userBO){

        String username = userBO.getUsername();
        String password = userBO.getPassword();
        String confirmPwd = userBO.getConfirmPassword();

        // 0. 判断用户名和密码必须不为空
        if (!StringUtils.isBlank(username) &&
                !StringUtils.isBlank(password)&&
                !StringUtils.isBlank(confirmPwd)) {
            return JSONResult.errorMsg("用户名或者密码不能为空");
        }

        // 1. 查询用户名是否存在

        // 2. 判断密码长度是否大于6位

        // 3. 判断两次密码是否一致

        // 4. 实现注册


        return JSONResult.ok();

    }

}
