package com.lefince.service.impl;

import com.lefince.dao.AccountMapper;
import com.lefince.entity.Account;
import com.lefince.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by lefince on 2018/3/16.
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public boolean deleteByPrimaryKey(Integer areaId) {
        int deleteCount = accountMapper.deleteByPrimaryKey(areaId);
        if(deleteCount>0){
            return true;
        }else {
            return false;
        }
    }

    @Transactional
    @Override
    public boolean insert(Account account) {
        if (account.getPhone()!=null && !"".equals(account.getPhone())) {
            account.setCreateTime(new Date());
            account.setUpdateTime(new Date());
            try {
                int insertCount = accountMapper.insert(account);
                if (insertCount > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入失败"+ e.getMessage());
            }
        }else {
            throw new RuntimeException("区域信息不能为空");
        }
    }

    @Override
    public int insertSelective(Account record) {
        return accountMapper.insertSelective(record);
    }

    @Override
    public Account selectByPrimaryKey(Integer areaId) {
        return accountMapper.selectByPrimaryKey(areaId);
    }

    @Override
    public boolean updateByPrimaryKeySelective(Account record) {
        if (record.getAccountId()!=null && !"".equals(record.getAccountId())) {
            record.setUpdateTime(new Date());
            try {
                int updateCount = accountMapper.updateByPrimaryKeySelective(record);
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
    public int updateByPrimaryKey(Account record) {
        return accountMapper.updateByPrimaryKey(record);
    }

    /*
    @Override
    public List<Account> queryArea() {
        return accountMapper.
    }
    */
}
