package com.netease.aophomework;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	@AfterReturning("execution(* com.netease.course.MyBalance.*(..)) && args(a, ..)")
	private void arithmeticDoLog(JoinPoint jp, int a) {
		System.out.println(a + ": " + jp.toString());
	}
}
