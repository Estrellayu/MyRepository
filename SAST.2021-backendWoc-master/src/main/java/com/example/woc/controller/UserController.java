package com.example.woc.controller;

import com.example.woc.entity.Account;
import com.example.woc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Estrelleyue
 * @create: 2022-02-15 01:22
 **/
@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;

    //这是一个示例,以POST方法提交数据

    /**
     * 完成注册功能
     * 选做：对密码进行加密处理
     * @param account
     */
    @PostMapping("/register")

    public String uploadUsername(@RequestBody Account account) {

        System.out.println(account.getId());//todo
        if (userService.findByUsername(account.getUsername(),account.getPassword(),account.getEmail())) {
            return "注册成功！";
        }
        else
            return "该账户已存在！请直接登录！";
    }

    /**
     * 完成登录功能
     * @param account
     * @return 是否登录成功
     */
    @PostMapping("/login")
    public String login(@RequestBody Account account) {

        //todo
        if (userService.findByUsername1(account.getUsername(),account.getPassword()))
            return "登录成功！";
        else
            return "登录失败！";
    }
}


