package com.lefince.service.impl;

import com.lefince.dao.AccountMapper;
import com.lefince.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceImplTest {

    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void deleteByPrimaryKey() {

    }

    @Test
    public void insert() {
        Account account = new Account();
        account.setPassword("123456");
        account.setCnname("liqingfeng");
        account.setName("dsdfsdf");
        account.setPhone("13989801044");
        account.setUpdateTime(new Date());
        account.setCreateTime(new Date());
        account.setBirthdayMonth(11);
        account.setBirthdayDay(1);
        account.setBirthdayYear(2014);
        accountMapper.insert(account);

    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}