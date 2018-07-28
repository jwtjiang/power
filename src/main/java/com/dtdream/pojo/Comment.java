package com.dtdream.pojo;

/**
 * 点评POJO
 */
public class Comment {
    /** 点评id **/
    private String commentid;
    /** 评价内容 **/
    private String content;
    /** 类型 **/
    private String factor;
    /** 报告id **/
    private String reportid;
    /**  模型名称 **/
    private String modelname;

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    public String getReportid() {
        return reportid;
    }

    public void setReportid(String reportid) {
        this.reportid = reportid;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }
}