package com.lefince.service;

import com.lefince.entity.Finace;
import java.util.List;

/**
 *
 */
public interface FinaceService {

    boolean deleteByPrimaryKey(Integer finaceId);

    boolean insert(Finace record);

    int insertSelective(Finace record);

    Finace selectByPrimaryKey(Integer finaceId);

    boolean updateByPrimaryKeySelective(Finace record);

    //int updateByPrimaryKey(Finace record);


    List<Finace> queryFinace(Integer accountId);

}
