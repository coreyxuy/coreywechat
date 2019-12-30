package com.itcorey.coreywechat.controller.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author corey
 * @Description 测试请求类
 * @create 2019-12-30 14:19
 */
@Data
@NoArgsConstructor
@ApiModel(description = "查询购物车")
public class HelloReq {

    @ApiModelProperty(value = "姓名",position = 2)
    private String name;

    @ApiModelProperty(value = "年纪",position = 1)
    private String age;

}
