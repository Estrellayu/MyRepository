package com.example.woc.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: Estrelleyue
 * @create: 2022-02-15 01:22
 **/


@Mapper
@Repository
public interface AdminMapper {
    //获取账户总数
    public Integer findAllAccounts();

    //通过username删除账户
    public void deleteAccountsByUsername(String username);
}
