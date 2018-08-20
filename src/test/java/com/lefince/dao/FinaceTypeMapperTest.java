package com.lefince.dao;

import com.lefince.entity.FinaceType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FinaceTypeMapperTest {

    @Autowired
    private FinaceTypeMapper finaceTypeMapper;

    @Test
    public void insert() {
        FinaceType finaceType = new FinaceType();
        finaceType.setFinaceCode("111dfsd");
        finaceType.setFinaceName("嘉实基金");
        finaceType.setRiskLevel("高");


        int irturn = finaceTypeMapper.insert(finaceType);
        Assert.isTrue(irturn > 0, "插入失败！");
    }

    @Test
    public void selectByPrimaryKey() {


        FinaceType finaceType = finaceTypeMapper.selectByPrimaryKey(1);
        Assert.isTrue(finaceType != null && finaceType.getFintypeId() > 0, "查询失败！");
    }
}