package com.lefince.dao;

import com.lefince.entity.Account;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountMapperTest {

    @Autowired
    private AccountMapper accountMapper;


   /* @Test

    public void deleteByPrimaryKey() {

    }
*/

    @Test
    //@Before
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
        int irturn = accountMapper.insert(account);
        Assert.isTrue(irturn > 0, "创建失败！");
    }


    @Test
    public void insertSelective() {
        Account account = new Account();
        account.setName("修改测试！");
        account.setAccountId(1);
        int ireturn = accountMapper.updateByPrimaryKeySelective(account);
        Assert.isTrue(ireturn > 0, "查询失败！");
    }

    @Test
    public void selectByPrimaryKey() {
        Account account = accountMapper.selectByPrimaryKey(1);
        Assert.isTrue((account != null && account.getAccountId() > 0), "修改失败！");
    }

    @Test
    public void updateByPrimaryKeySelective() {
        Account account = new Account();
        account.setName("修改测试！");
        account.setAccountId(1);
        int irturn = accountMapper.updateByPrimaryKeySelective(account);
        Assert.isTrue(irturn > 0, "修改失败！");
    }

    @Test
    public void updateByPrimaryKey() {
        Account account = new Account();
        account.setPhone("13858043045");
        account.setAccountId(1);
        int irturn = accountMapper.updateByPrimaryKeySelective(account);
        Assert.isTrue(irturn > 0, "更新失败！");
    }

}