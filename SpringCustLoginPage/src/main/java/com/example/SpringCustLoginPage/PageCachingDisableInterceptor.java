package com.example.SpringCustLoginPage;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class PageCachingDisableInterceptor  implements HandlerInterceptor  {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("p");
		arg1.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
		arg1.setHeader("Pragma", "no-cache"); // HTTP 1.0
		arg1.setDateHeader("Expires", 0); // Proxies.
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
			Object handler, Exception ex) throws Exception {
	}
	
}
