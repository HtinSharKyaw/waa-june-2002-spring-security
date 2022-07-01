package edu.miu.springsecurity1.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class WaaOffensiveWordsAspect {

    @Pointcut("@annotation(edu.miu.springsecurity1.aop.annotations.filterInterface)")
    public void a(){}

    public void filterWords(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        //TODO
    }

}
