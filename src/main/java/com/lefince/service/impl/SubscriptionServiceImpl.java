package com.lefince.service.impl;

import com.lefince.dao.SubscriptionMapper;
import com.lefince.entity.Subscription;
import com.lefince.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 *
 */
public class SubscriptionServiceImpl implements SubscriptionService {

    @Autowired
    private SubscriptionMapper subscriptionMapper;


    /**
     * 查询所有的订阅者；
     * @return
     */
    @Override
    public List<Subscription> queryAllSubscriptions() {
        return  null;
        //return subscriptionMapper.selectByPrimaryKey(accountId);
    }

}
