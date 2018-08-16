package com.lefince.dao;

import com.lefince.entity.FinaceType;

public interface FinaceTypeMapper {
    int deleteByPrimaryKey(Integer fintypeId);

    int insert(FinaceType record);

    int insertSelective(FinaceType record);

    FinaceType selectByPrimaryKey(Integer fintypeId);

    int updateByPrimaryKeySelective(FinaceType record);

    int updateByPrimaryKey(FinaceType record);
}