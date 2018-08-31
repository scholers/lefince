package com.lefince.dao;

import com.lefince.entity.Subscription;

public interface SubscriptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Subscription record);

    int insertSelective(Subscription record);

    Subscription selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Subscription record);

    int updateByPrimaryKey(Subscription record);
}