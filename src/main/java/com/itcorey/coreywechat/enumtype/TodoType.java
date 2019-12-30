package com.itcorey.coreywechat.enumtype;

/**
 *
 * @Author corey
 * @Description 支付方式
 * @Date 2019/11/15
 **/
public enum TodoType {
    ALIPAY(1, "alipay", "/alipay/save"),
    WECHAT(2, "weChat", "/weChat/save");

    public final Integer code;
    public final String desc;
    public final String url;

    TodoType(Integer code, String desc, String url) {
        this.code = code;
        this.desc = desc;
        this.url = url;
    }

    public static String getDesc(Integer code) {
        TodoType[] enums = values();
        for (TodoType type : enums) {
            if (type.code().equals(code)) {
                return type.desc();
            }
        }
        return "";
    }

    public static Integer getCode(Integer desc) {
        TodoType[] enums = values();
        for (TodoType type : enums) {
            if (type.desc().equals(desc)) {
                return type.code();
            }
        }
        return 0;
    }

    public Integer code() {
        return this.code;
    }

    public String desc() {
        return this.desc;
    }

    public String url() {
        return this.url;
    }


}
