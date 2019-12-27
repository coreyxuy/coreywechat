package com.itcorey.coreywechat.baseResult;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

/**
 * @author corey
 * @create 2019-12-27 17:10
 */
public class CoreResponse<T> implements Serializable {

    private static final long serialVersionUID = 6068250409891922171L;
    private String code;
    private String msg;

    @JSONField(
            name = "sub_msg"
    )
    private String subMsg;
    private T data;

    @JsonIgnore
    @JSONField(
            serialize = false
    )
    private StatusEnum statusInfo;

    private CoreResponse(StatusEnum statusInfo, String subMsg, T data) {
        this.statusInfo = statusInfo;
        this.code = statusInfo.getCode();
        this.msg = statusInfo.getMessage();
        this.subMsg = subMsg;
        this.data = data;
    }

    public static <T> CoreResponse<T> success(T data) {
        return new CoreResponse(StatusEnum.SUCCESS, (String)null, data);
    }

    public static <T> CoreResponse<T> fail(StatusEnum statusEnum, String subMsg) {
        return new CoreResponse(statusEnum, subMsg, (Object)null);
    }

    public static <T> CoreResponse<T> fail(StatusEnum statusEnum, String subMsg, T data) {
        return new CoreResponse(statusEnum, subMsg, data);
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getSubMsg() {
        return this.subMsg;
    }

    public CoreResponse<T> setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }

    public T getData() {
        return this.data;
    }

    public StatusEnum getStatusInfo() {
        return this.statusInfo;
    }

}
