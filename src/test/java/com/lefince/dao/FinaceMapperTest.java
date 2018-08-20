package com.lefince.dao;

import com.lefince.entity.Finace;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinaceMapperTest {

    @Autowired
    private FinaceMapper finaceMapper;

    @Test
    public void deleteByPrimaryKey() {
        /*
        Finace finace = new Finace();
        finace.setFinaceId(1);
        finace.setAccountId(11);
        finace.setFinaceName("盈盈理财");
        finace.setBenefitMoney(40000);
        finace.setFinaceCode("test");
        finace.setBenefitType("tetsttype");
        finace.setOutType("out");
        finace.setPincipalMonty(-144);
        finace.setFinaceType("更新记录");

        int irturn = finaceMapper.deleteByPrimaryKey(1);
        Assert.isTrue(irturn > 0, "更新失败！");
        */
    }

    @Test
    public void insert() {
        Finace finace = new Finace();
        finace.setAccountId(11);
        finace.setFinaceName("盈盈理财");
        finace.setBenefitMoney(4000);
        finace.setFinaceCode("test");
        finace.setBenefitType("tetsttype");
        finace.setOutType("out");
        finace.setPincipalMonty(-122);
        finace.setUpdateTime(new Date());
        finace.setCreateTime(new Date());

        finaceMapper.insert(finace);
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {

        Finace finace =finaceMapper.selectByPrimaryKey(1);
        Assert.isTrue(finace != null && finace.getAccountId() > 0, "更新失败！");
    }

    @Test
    public void updateByPrimaryKeySelective() {
        Finace finace = new Finace();
        finace.setFinaceId(1);
        finace.setAccountId(11);
        finace.setFinaceName("盈盈理财");
        finace.setBenefitMoney(40000);
        finace.setFinaceCode("test");
        finace.setBenefitType("tetsttype");
        finace.setOutType("out");
        finace.setPincipalMonty(-144);
        finace.setFinaceType("更新记录");

        int irturn = finaceMapper.updateByPrimaryKey(finace);
        Assert.isTrue(irturn > 0, "更新失败！");
    }

    @Test
    public void updateByPrimaryKey() {
        Finace finace = new Finace();
        finace.setFinaceId(1);
        finace.setAccountId(1111);
        finace.setFinaceName("盈盈理财");
        finace.setBenefitMoney(40000);
        finace.setFinaceCode("test1");
        finace.setBenefitType("tetsttype1");
        finace.setOutType("out");
        finace.setPincipalMonty(-133);
        finace.setFinaceType("更新记录");

        int irturn = finaceMapper.updateByPrimaryKey(finace);
        Assert.isTrue(irturn > 0, "更新失败！");
    }
}