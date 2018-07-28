package com.dtdream.pojo;

import java.util.Date;

/**
 * 报表POJO
 */
public class Report {
    /** 报告ID **/
    private String reportid;
    /** 报告名称 **/
    private String title;
    /** 报告生成时间 **/
    private Date createtime;
    /** 符合度 **/
    private String conformity;
    /** 0 删除 1未删 **/
    private Integer reportDelStatus;
    /**  date预留字段2**/
    private Date date2;
    /** date预留字段1 **/
    private Date date1;
    /** 字符串预留字段3 **/
    private String bz3;
    /**  字符串预留字段2**/
    private String bz2;
    /** 字符串预留字段1 **/
    private String bz1;

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getConformity() {
        return conformity;
    }

    public void setConformity(String conformity) {
        this.conformity = conformity;
    }

    public Integer getReportDelStatus() {
        return reportDelStatus;
    }

    public void setReportDelStatus(Integer reportDelStatus) {
        this.reportDelStatus = reportDelStatus;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public String getBz3() {
        return bz3;
    }

    public void setBz3(String bz3) {
        this.bz3 = bz3;
    }

    public String getBz2() {
        return bz2;
    }

    public void setBz2(String bz2) {
        this.bz2 = bz2;
    }

    public String getBz1() {
        return bz1;
    }

    public void setBz1(String bz1) {
        this.bz1 = bz1;
    }
}