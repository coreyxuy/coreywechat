package com.itcorey.coreywechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = "com.itcorey.coreywechat.mapper")
public class CoreywechatApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreywechatApplication.class, args);
    }

}
