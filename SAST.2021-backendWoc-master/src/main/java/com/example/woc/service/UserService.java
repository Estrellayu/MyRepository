package com.example.woc.service;

import com.example.woc.entity.Account;
import com.example.woc.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Estrelleyue
 * @create: 2022-02-15 01:22
 **/
@Transactional
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    //是否存在该username，若不存在则注册成功
    public Boolean findByUsername(String username,String password,String email) {
        if (userMapper.findByUsername(username,password,email) == null){
            userMapper.addAccount(username,password,email);
            return true;
        }
        else {
            return false;
        }
    }
    //id对应的密码是否正确,正确则登录成功
    public Boolean findByUsername1(@Param("username") String username, @Param("password") String password) {
        if (userMapper.findByUsername1(username, password) != null)
            return true;
        else
            return false;
    }


}
