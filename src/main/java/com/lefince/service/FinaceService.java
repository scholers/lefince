package com.lefince.service;

import com.lefince.entity.Account;

public interface FinaceService {

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
