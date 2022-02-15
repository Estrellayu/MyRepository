package com.example.woc.mapper;


import com.example.woc.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author: Estrelleyue
 * @create: 2022-02-15 01:22
 **/
@Mapper
@Repository

public interface UserMapper {
    //是否存在该username，若否注册成功
    Account findByUsername(String username,String password,String email);

    //若注册成功则新增用户
    void addAccount(String username,String password,String email);

    //id对应的密码是否正确,正确则登录成功
    Account findByUsername1(@Param("username") String username, @Param("password") String password);

}
