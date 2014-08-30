package com.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.models.Student;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/test")
    public String test(HttpServletRequest request) {
	Student s = new Student();
	System.out.println("name===" + s.getName());
	System.out.println("password===" + s.getPassword());
	String userName = request.getParameter("userName");
	String userPwd = request.getParameter("userPwd");
	request.setAttribute("userName", userName);
	if (s.getName().equals(userName) && s.getPassword().equals(userPwd)) {
	    return "success";
	}
	return "fail";
    }
}
