package com.itheima.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//切面类

@Component("myAspect")
@Aspect//标注当前类是一个切面类。
public class MyAspect {
    //配置前置通知
//    @Before("execution(* com.itheima.anno.*.*(..))")
//    public void before() {
//        System.out.println("前置增强...");
//    }
//
//    @AfterReturning("execution(* com.itheima.anno.*.*(..))")
//    public void afterReturning() {
//        System.out.println("后置增强...");
//    }

    //Proceeding JoinPoint:  正在执行的连接点===切点
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强。。。");
        Object proceed = pjp.proceed();//切点方法
        System.out.println("环绕后增强。。。");
        return proceed;
    }

    //异常抛出增强
//    @AfterThrowing("execution(* com.itheima.anno.*.*(..))")
//    public void afterThrowing() {
//        System.out.println("异常抛出增强");
//    }

    //最终增强
//    @After("execution(* com.itheima.anno.*.*(..))")
//    public void after() {
//        System.out.println("最终增强");
//    }
//    @After("pointcut()")//扫描这个注解是执行pointcut这个方法，这个方法上的注解也会被执行。
//    public void after() {
//        System.out.println("最终增强..........");
//    }


    //定义切点表达式
    @Pointcut("execution(* com.itheima.anno.*.*(..))")
    public void pointcut() {

    }
}
