package com.example.woc.controller;

import com.example.woc.mapper.AdminMapper;
import com.example.woc.service.AdminService;
import com.example.woc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: Estrelleyue
 * @create: 2022-02-15 01:22
 **/
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    //请仿照 User 补充 Admin 的三层架构并完成接口
    private AdminService adminService;
    /**
     * 获取当前的账户总数
     * @return
     */
    @GetMapping("/getAmount")
    public Integer getAmountOfAccounts(){

        //todo
        return adminService.findAllAccounts();
    }

    /**
     * 根据用户名删除账户
     * @param username
     */
    @PutMapping ("deleteAccount")
    public void deleteAccount(@RequestBody String username){

        //todo
        adminService.deleteAccountsByUsername(username);
    }
}
