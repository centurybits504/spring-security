package com.websystique.springsecurity.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.websystique.springsecurity")
public class HelloWorldConfiguration extends WebMvcConfigurerAdapter {
	
	@Autowired
	SessionInterceptor sessionInterceptor;
	@Autowired
	SessionNotInterceptor sessionNotInterceptor;
	@Autowired
	PageCachingDisableInterceptor pageCachingDisableInterceptor;
	
	@Bean(name="HelloWorld")
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	/*
     * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }
    
    
    @Override
	public void addInterceptors(InterceptorRegistry registry) {
	   
	  /*  registry.addInterceptor(sessionNotInterceptor)
		.addPathPatterns("/")
		.addPathPatterns("/logout")
		.excludePathPatterns("/static/**");

	    registry.addInterceptor(sessionInterceptor)
	    .excludePathPatterns("/static/**","/login","/logout");
	    
	    registry.addInterceptor(pageCachingDisableInterceptor)
	    .excludePathPatterns("/static/**");
*/
	    
	}
	
    
    
}