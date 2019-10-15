package com.qingyunerya.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecondAspect {
	@Around(value = "execution(* com.qingyunerya.spring.TestAOPService2.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("SecondStart"+joinPoint.getSignature().getName());
		Object object=joinPoint.proceed();
		System.out.println("SecondEnd"+joinPoint.getSignature().getName());
		return object;
	}
	
	public Object sec(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("SecondStart"+joinPoint.getSignature().getName());
		Object object=joinPoint.proceed();
		System.out.println("SecondEnd"+joinPoint.getSignature().getName());
		return object;
	}
}
