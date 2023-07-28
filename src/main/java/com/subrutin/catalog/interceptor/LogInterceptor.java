package com.subrutin.catalog.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogInterceptor implements HandlerInterceptor{

	@Override
	//method yg akan dieksekusi sebelum request masuk ke controller
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		log.info("preHandle log interceptor");
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

	@Override
	//method yg akan dieksekusi setelah request selesai diproses controller dn akan dirender ke view
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		log.info("postHandle log interceptor");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	//method callback yg dieksekusi setelah req dan kompenen view selesai dirender
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		log.info("afterCompletion log interceptor");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
	

}
