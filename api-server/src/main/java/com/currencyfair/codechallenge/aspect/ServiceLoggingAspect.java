package com.currencyfair.codechallenge.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Aspect
@Component
public class ServiceLoggingAspect {

	private static final Logger logger = LoggerFactory.getLogger(ServiceLoggingAspect.class);

	@Pointcut("@within(org.springframework.stereotype.Service)")
	public void serviceOp() {
	}

	@Around("serviceOp()")
	public Object doAroundOther(ProceedingJoinPoint joinPoint) throws Throwable {
		logMethodEntry(joinPoint);
		Object result = joinPoint.proceed();
		logMethodReturn(joinPoint);
		return result;
	}

	private void logMethodReturn(JoinPoint joinPoint) {
		StringBuilder sb = new StringBuilder();
		sb.append(joinPoint.getTarget().getClass().getSimpleName())
			.append(".")
			.append(joinPoint.getSignature().getName())
			.append("#end");
		logger.info(sb.toString());
	}

	private void logMethodEntry(JoinPoint joinPoint) {
		StringBuilder sb = new StringBuilder();
		sb.append(joinPoint.getTarget().getClass().getSimpleName())
			.append(".")
			.append(joinPoint.getSignature().getName())
			.append("#start");
		logger.info(sb.toString());
	}
}
