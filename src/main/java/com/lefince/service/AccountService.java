package com.lefince.service;

import com.lefince.entity.Account;

/**
 * Created by lefince on 2018/3/16.
 */
public interface AccountService {

    boolean deleteByPrimaryKey(Integer accountId);

    boolean insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer areaId);

    boolean updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    /*
    List<TbArea> queryArea();
    */
}
