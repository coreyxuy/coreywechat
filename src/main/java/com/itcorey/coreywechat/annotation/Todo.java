package com.itcorey.coreywechat.annotation;

import com.itcorey.coreywechat.enumtype.TodoType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    /**
     *
     * @Author wenchangping
     * @Description 默认支付方式是支付宝
     * @Date 2019/11/15
     **/
    TodoType value() default TodoType.ALIPAY;
}
