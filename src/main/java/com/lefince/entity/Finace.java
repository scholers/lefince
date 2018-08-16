package com.lefince.entity;

import java.util.Date;

public class Finace {
    private Integer finaceId;

    private Integer accountId;

    private String outType;

    private String finaceType;

    private String finaceCode;

    private String finaceName;

    private Integer pincipalMonty;

    private Integer benefitMoney;

    private String benefitType;

    private Date updateTime;

    private Date createTime;

    private String demo;

    public Integer getFinaceId() {
        return finaceId;
    }

    public void setFinaceId(Integer finaceId) {
        this.finaceId = finaceId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getOutType() {
        return outType;
    }

    public void setOutType(String outType) {
        this.outType = outType == null ? null : outType.trim();
    }

    public String getFinaceType() {
        return finaceType;
    }

    public void setFinaceType(String finaceType) {
        this.finaceType = finaceType == null ? null : finaceType.trim();
    }

    public String getFinaceCode() {
        return finaceCode;
    }

    public void setFinaceCode(String finaceCode) {
        this.finaceCode = finaceCode == null ? null : finaceCode.trim();
    }

    public String getFinaceName() {
        return finaceName;
    }

    public void setFinaceName(String finaceName) {
        this.finaceName = finaceName == null ? null : finaceName.trim();
    }

    public Integer getPincipalMonty() {
        return pincipalMonty;
    }

    public void setPincipalMonty(Integer pincipalMonty) {
        this.pincipalMonty = pincipalMonty;
    }

    public Integer getBenefitMoney() {
        return benefitMoney;
    }

    public void setBenefitMoney(Integer benefitMoney) {
        this.benefitMoney = benefitMoney;
    }

    public String getBenefitType() {
        return benefitType;
    }

    public void setBenefitType(String benefitType) {
        this.benefitType = benefitType == null ? null : benefitType.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo == null ? null : demo.trim();
    }
}