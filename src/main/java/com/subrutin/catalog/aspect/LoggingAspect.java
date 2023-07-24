package com.subrutin.catalog.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Aspect
public class LoggingAspect {
	
	@Pointcut("execution(* com.subrutin.catalog.web.*.*(..))")
	private void restAPI() {}
	
	@Pointcut("within(com.subrutin.catalog.web.*)")
	private void withinPointcutExample() {}
	
	@Pointcut("args(com.subrutin.catalog.dto.PublisherCreateRequestDTO)")
	private void argsPointcutExample() {}
	
	@Pointcut("@args(com.subrutin.catalog.annotation.LogThisArg)")
	private void argsAnnotationPointcutExample() {}
	
	@Pointcut("@annotation(com.subrutin.catalog.annotation.LogThisMethod)")
	private void annotationPoincutExample() {}
	
	@Before("annotationPoincutExample()")
	public void beforeExecutedLogging() {
		log.info("this is log from aspect");
	}

}