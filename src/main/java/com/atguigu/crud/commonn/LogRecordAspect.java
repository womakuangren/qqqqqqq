package com.atguigu.crud.commonn;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect   //定义一个切面
@Component
public class LogRecordAspect {

    /**
     * 1、告诉ioc这个组件的存在
     * 2、告诉ioc这是一个切面使用@Aspect
     * try{
     *
     * @Before前置通知 method.invoke();
     * @AfterRunning返回通知 }catch(e){
     * @AfterThrowing：异常通知， }
     * @After 告诉Spring这些放在都在那个方法的哪个位置执行
     * 1）、告诉位置
     * [1]@Before：前置通知，在方法执行之前执行
     * [2]@After：后置通知，在方法执行最终结束之后执行。
     * 如果没异常
     * [3]@AfterRunning：返回通知，在方法返回结果之后执行
     * [4]@AfterThrowing：异常通知，在方法抛出异常之后执行
     * 1、编写切入点表达式，来告诉spring是切入哪个方法的这个位置
     */
    @Before(value = "execution(public * *.add(int, int))")
    public void logStart() {
        System.out.println("AOP日志，方法开始");
    }

    @After(value = "execution(public * *.add(int, int))")
    public void logEnd() {
        System.out.println("AOP日志，方法最终结束");
    }

    @AfterThrowing(value = "execution(public * *.add(int, int))")
    public void logException() {
        System.out.println("AOP日志，方法出现异常");
    }

    @AfterReturning(value = "execution(public * *.add(int, int))")
    public void logReturn() {
        System.out.println("AOP日志，方法正常执行");
    }
}
