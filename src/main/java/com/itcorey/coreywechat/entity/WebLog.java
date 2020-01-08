package com.itcorey.coreywechat.entity;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author corey
 * @Description
 * @create 2019-12-30 11:21
 */
@Data
@NoArgsConstructor
public class WebLog implements Serializable {

    private static final long serialVersionUID = -654754073630521374L;
    @ApiModelProperty(example = "操作描述")
    private String description;

    @ApiModelProperty(example = "操作用户")
    private String username;

    @ApiModelProperty(example = "操作时间")
    private Long startTime;

    @ApiModelProperty(example = "消耗时间")
    private Integer spendTime;

    @ApiModelProperty(example = "根路径")
    private String basePath;

    @ApiModelProperty(example = "URI")
    private String uri;

    @ApiModelProperty(example = "URL")
    private String url;

    @ApiModelProperty(example = "请求类型")
    private String method;

    @ApiModelProperty(example = "IP地址")
    private String ip;

    @ApiModelProperty(example = "请求参数")
    private Object parameter;

    @ApiModelProperty(example = "请求返回的结果")
    private Object result;

}
