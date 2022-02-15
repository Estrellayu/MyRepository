package com.example.woc.service;

import com.example.woc.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Estrelleyue
 * @create: 2022-02-15 01:22
 **/
@Transactional
@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;
    //获取账户总数
    public Integer findAllAccounts() {
        return adminMapper.findAllAccounts();
    }

    //通过username删除账户
    public void deleteAccountsByUsername(String username) {
        adminMapper.deleteAccountsByUsername(username);
    }
}
