package com.lefince.dao;

import com.lefince.entity.Finace;

public interface FinaceMapper {
    int deleteByPrimaryKey(Integer finaceId);

    int insert(Finace record);

    int insertSelective(Finace record);

    Finace selectByPrimaryKey(Integer finaceId);

    int updateByPrimaryKeySelective(Finace record);

    int updateByPrimaryKey(Finace record);
}