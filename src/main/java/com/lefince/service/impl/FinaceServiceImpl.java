package com.lefince.service.impl;

import com.lefince.dao.FinaceMapper;
import com.lefince.entity.Finace;
import com.lefince.service.FinaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 *
 */
public class FinaceServiceImpl implements FinaceService {
    @Autowired
    private FinaceMapper finaceMapper;

    @Override
    public boolean deleteByPrimaryKey(Integer finaceId) {
        int deleteCount = finaceMapper.deleteByPrimaryKey(finaceId);
        if(deleteCount>0){
            return true;
        }else {
            return false;
        }
    }

    @Transactional
    @Override
    public boolean insert(Finace finace) {
        if (finace.getBenefitMoney()!=null && !"".equals(finace.getBenefitMoney())) {
            try {
                int insertCount = finaceMapper.insert(finace);
                if (insertCount > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入失败"+ e.getMessage());
            }
        }else {
            throw new RuntimeException("投入本金不能为空");
        }
    }

    @Override
    public int insertSelective(Finace record) {
        return finaceMapper.insertSelective(record);
    }

    @Override
    public Finace selectByPrimaryKey(Integer finaceId) {
        return finaceMapper.selectByPrimaryKey(finaceId);
    }

    @Override
    public boolean updateByPrimaryKeySelective(Finace record) {
        if (record.getAccountId()!=null && !"".equals(record.getAccountId())) {
            record.setUpdateTime(new Date());
            try {
                int updateCount = finaceMapper.updateByPrimaryKeySelective(record);
                if (updateCount > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新失败"+ e.getMessage());
            }
        }else {
            throw new RuntimeException("区域信息不能为空");
        }
    }



    @Override
    public List<Finace> queryFinace(Integer accountId) {
        return finaceMapper.queryFinace(accountId);
    }

}

