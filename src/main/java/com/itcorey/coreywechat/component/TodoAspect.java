package com.itcorey.coreywechat.component;

import com.itcorey.coreywechat.annotation.Todo;
import com.itcorey.coreywechat.baseResult.CommonResult;
import com.itcorey.coreywechat.enumtype.TodoType;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author corey
 * @Description
 * @create 2019-12-30 11:12
 */
@Aspect
@Component
public class TodoAspect {

    @Pointcut("@annotation(com.itcorey.coreywechat.annotation.Todo)")
    public void TodoLog() {
    }

    @Before("TodoLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {

    }

    @AfterReturning(returning = "ret", pointcut = "TodoLog()")
    public void doAfterReturning(JoinPoint joinPoint, CommonResult ret) throws Throwable {
        MethodSignature ms = (MethodSignature) joinPoint.getSignature();
        Todo todo = ms.getMethod().getAnnotation(Todo.class);
        //监听带Todo注解的请求
        TodoType type = todo.value();
        //处理获取到接口的返回结果
        //todo 处理选择的支付方式
        Integer payType = TodoType.getCode(type.code);
        //todo 支付方式选择

    }


}
