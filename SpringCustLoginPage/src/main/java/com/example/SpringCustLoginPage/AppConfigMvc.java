package com.example.SpringCustLoginPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

 
@Configuration 
public class AppConfigMvc extends WebMvcConfigurerAdapter  { 
		
		@Autowired
		SessionInterceptor sessionInterceptor;
		@Autowired
		SessionNotInterceptor sessionNotInterceptor;
		@Autowired
		PageCachingDisableInterceptor pageCachingDisableInterceptor;
		
		
		@Override
		 public void addInterceptors(InterceptorRegistry registry) {
		    	
		    /*	registry.addInterceptor(sessionNotInterceptor)
				.addPathPatterns("/");
		registry.addInterceptor(sessionInterceptor)
		.addPathPatterns("/");

		registry.addInterceptor(pageCachingDisableInterceptor)
				.addPathPatterns("/");*/
			
			
			/*registry.addInterceptor(sessionNotInterceptor)
			.addPathPatterns("/")
			.addPathPatterns("/my-login");*/
	
	/*registry.addInterceptor(sessionInterceptor);*/
	
   /* registry.addInterceptor(pageCachingDisableInterceptor)
    		;*/
			
		    }
		
		
		 @Bean
		    public ViewResolver viewResolver() {
		        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		        viewResolver.setPrefix("/WEB-INF/views/");
		        viewResolver.setSuffix(".jsp");
		        return viewResolver;
		    }
		
}
