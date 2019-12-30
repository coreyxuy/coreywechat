package com.itcorey.coreywechat.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


public class SysRespLog {

    private Integer id;

    private String basePath;

    private String method;

    private String ip;

    private String description;

    private Date starttime;

    private String uri;

    private String url;

    private String spendtime;

    private String reqInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath == null ? null : basePath.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getSpendtime() {
        return spendtime;
    }

    public void setSpendtime(String spendtime) {
        this.spendtime = spendtime == null ? null : spendtime.trim();
    }

    public String getReqInfo() {
        return reqInfo;
    }

    public void setReqInfo(String reqInfo) {
        this.reqInfo = reqInfo == null ? null : reqInfo.trim();
    }
}