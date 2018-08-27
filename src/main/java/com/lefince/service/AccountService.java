package com.lefince.service;

import com.lefince.entity.Account;

/**
 * Created by lefince on 2018/3/16.
 */
public interface AccountService {

    boolean insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer areaId);

    boolean updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    Account queryAccountByOpId(String opId);

}
