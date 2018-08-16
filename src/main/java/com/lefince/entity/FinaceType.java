package com.lefince.entity;

public class FinaceType {
    private Integer fintypeId;

    private String finaceCode;

    private String finaceName;

    private String riskLevel;

    private String updateTime;

    private String createTime;

    public Integer getFintypeId() {
        return fintypeId;
    }

    public void setFintypeId(Integer fintypeId) {
        this.fintypeId = fintypeId;
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

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel == null ? null : riskLevel.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }
}