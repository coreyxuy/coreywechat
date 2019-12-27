package com.itcorey.coreywechat.baseResult;

/**
 * @author corey
 * @Description
 * @create 2019-12-27 17:15
 */
public enum StatusEnum {
    SUCCESS("10000", "OK"),
    ONLY_READ("20001", "只有查看权限，无写权限"),
    UNAUTHORIZED("20002", "无权限进行此操作，请跟管理员联系"),
    NOREQUIREDPARAM("40001", "缺少必选参数"),
    ERROR_PARAM("40002", "非法的参数"),
    NOSESSION("40003", "未登录，请先登录"),
    FORBIDDEN("40004", "业务处理失败"),
    BUSINESS("40005", "服务器忙，请稍后再次尝试，或者跟管理员联系"),
    REFRESH_TOKEN_ERROR("40006", "刷新token失败"),
    REFRESH_TOKEN("40007", "刷新token"),
    NO_MODULE_POWER("40008", "缺少模块权限"),
    NORESOURCE("40010", "请求的资源不存在"),
    USER_WRONG("41001", "用户名不存在"),
    PASSWORD_WRONG("41002", "密码错误"),
    USER_NOT_ACTIVED("41003", "账号未激活，请联系管理员"),
    USER_NOT_MIGRATE("41004", "新老平台账号有问题"),
    TOKEN_INVALID("41005", "授权令牌无效"),
    EXTEND_FORBIDDEN("41006", "拓展业务处理失败"),
    NOTOKEN("41007", "授权令牌不存在"),
    DUPLICATE_OPT("50001", "重复的操作");

    private final String code;
    private final String message;

    private StatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

}
