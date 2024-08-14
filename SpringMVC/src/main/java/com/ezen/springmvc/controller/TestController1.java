package com.ezen.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value="/test1")
@Controller
public class TestController1 {

	// 매핑 uri  값을 여러개 등록하는 것도 가능
	@RequestMapping(value= {"/p1", "/p2", "/p3"})
	public String page123() {
		return "/test1/page123";
	}
	
	@RequestMapping(value="p4")
	public String page4() {
		return "/test1/page4";
	}
	
	@RequestMapping(value="/p1", method=RequestMethod.POST)
	public String page1() {
		return "/test1/post1";
	}
}
