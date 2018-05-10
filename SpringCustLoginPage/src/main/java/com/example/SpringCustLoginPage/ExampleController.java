package com.example.SpringCustLoginPage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ExampleController {

	
	@Autowired
	HttpServletRequest request; 
	@Autowired
	HttpServletResponse response;
	
    @RequestMapping("/my-login")
    public String handleRequest2(ModelMap map) {
    	
    	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
    	System.out.println(name);
		
    	

        map.addAttribute("time", LocalDateTime.now().toString());
        return "my-page";
    }
    
    
    
    @RequestMapping("/")
    public String handleRequest1(ModelMap map) {
        //map.addAttribute("time", LocalDateTime.now().toString());
    	
        return "my-login-page";
    }
}