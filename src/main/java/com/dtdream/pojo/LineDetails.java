package com.dtdream.pojo;

import java.util.Date;

/**
 *线路明细POJO
 */
public class LineDetails {
    /** 线路存储id **/
    private String id;
    /** 线路名称**/
    private String lineName;
    /** 线路ID **/
    private String lineId;
    /** 杆塔名称**/
    private String towerName;
    /** 杆塔id **/
    private String towerId;
    /** 杆塔所在地区的父地区编号 **/
    private String parentregion;
    /** WHDJ **/
    private String whdj;
    /** 绝缘爬距 **/
    private Integer insulationCreepDistance;
    /** 绝缘吨位 **/
    private Integer insulationTon;
    /** 绝缘配置高度 **/
    private Integer insulationHigh;
    /** 绝缘配置每串个数 **/
    private Integer insulationBunchNum;
    /**  接地电阻设置值**/
    private Integer resistanceDesignValue;
    /** 杆塔经度 **/
    private Float stationmap1;
    /** 杆塔纬度 **/
    private Float stationmap2;
    /** 电压等级 **/
    private String voltage;
    /** 线路长度 **/
    private Float lineLength;
    /** 供电公司 **/
    private String maintainer;
    /** REGION **/
    private String region;
    /** 0 删除 1未删 **/
    private Integer lineDelStatus;
    /** 地形地貌 **/
    private String dilei;
    /** 月份 **/
    private Integer datetimeMonth;
    /** 日期时间 **/
    private Date datetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getTowerName() {
        return towerName;
    }

    public void setTowerName(String towerName) {
        this.towerName = towerName;
    }

    public String getTowerId() {
        return towerId;
    }

    public void setTowerId(String towerId) {
        this.towerId = towerId;
    }

    public String getParentregion() {
        return parentregion;
    }

    public void setParentregion(String parentregion) {
        this.parentregion = parentregion;
    }

    public String getWhdj() {
        return whdj;
    }

    public void setWhdj(String whdj) {
        this.whdj = whdj;
    }

    public Integer getInsulationCreepDistance() {
        return insulationCreepDistance;
    }

    public void setInsulationCreepDistance(Integer insulationCreepDistance) {
        this.insulationCreepDistance = insulationCreepDistance;
    }

    public Integer getInsulationTon() {
        return insulationTon;
    }

    public void setInsulationTon(Integer insulationTon) {
        this.insulationTon = insulationTon;
    }

    public Integer getInsulationHigh() {
        return insulationHigh;
    }

    public void setInsulationHigh(Integer insulationHigh) {
        this.insulationHigh = insulationHigh;
    }

    public Integer getInsulationBunchNum() {
        return insulationBunchNum;
    }

    public void setInsulationBunchNum(Integer insulationBunchNum) {
        this.insulationBunchNum = insulationBunchNum;
    }

    public Integer getResistanceDesignValue() {
        return resistanceDesignValue;
    }

    public void setResistanceDesignValue(Integer resistanceDesignValue) {
        this.resistanceDesignValue = resistanceDesignValue;
    }

    public Float getStationmap1() {
        return stationmap1;
    }

    public void setStationmap1(Float stationmap1) {
        this.stationmap1 = stationmap1;
    }

    public Float getStationmap2() {
        return stationmap2;
    }

    public void setStationmap2(Float stationmap2) {
        this.stationmap2 = stationmap2;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public Float getLineLength() {
        return lineLength;
    }

    public void setLineLength(Float lineLength) {
        this.lineLength = lineLength;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getLineDelStatus() {
        return lineDelStatus;
    }

    public void setLineDelStatus(Integer lineDelStatus) {
        this.lineDelStatus = lineDelStatus;
    }

    public String getDilei() {
        return dilei;
    }

    public void setDilei(String dilei) {
        this.dilei = dilei;
    }

    public Integer getDatetimeMonth() {
        return datetimeMonth;
    }

    public void setDatetimeMonth(Integer datetimeMonth) {
        this.datetimeMonth = datetimeMonth;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}