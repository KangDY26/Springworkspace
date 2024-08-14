package com.ezen.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ezen.springmvc.dto.Student;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class TestController2 {

	@GetMapping("/test2/page1")
	public String page1(
			HttpServletRequest request,
			HttpServletResponse response) {
		
		System.out.println(request.getRemoteAddr());
		System.out.println(request.getMethod());
		System.out.println(request.getServletContext());
		System.out.println(request.getSession());
		
		request.setAttribute("coffee", "아메리카노");
		
		return "/test2/page1";
	}
	
	@GetMapping("/test2/stu")
	public String stuForm() {
		return "/test2/stuForm";
	}
	
	@PostMapping("/test2/stu")
	public String stu(Student stu, HttpServletRequest request) {
		// 모델 객체를 활용하면 request.getParameter() 작업을 생략 할 수 있다
		// (단, 필드 이름과 name속성 값이 완전히 동일해야한다)
		
		// ※ 원래 해야하는 작업
		// stu = new Student();
		// stu.setStu_name(request.getParameter("stu_name));
		
		System.out.println(stu);
		
		request.setAttribute("stu", stu);
		
		
		return "/test2/stuDetail";
	}
	
	@PostMapping("/test2/stu2")
	public String stu2(
			String stu_name,
			Integer kor, 
			Integer eng, 
			@ModelAttribute("math") Integer myMath,
			Model model) {
		
		System.out.println("stu_name: " + stu_name);
		System.out.println("kor: " + kor);
		System.out.println("eng: " + eng);
		System.out.println("math: " + myMath);
		
		Student stu = new Student();
		
		stu.setStu_name(stu_name);
		stu.setKor(kor);
		stu.setEng(eng);
		stu.setMath(myMath);
		
		// model은 request의 setAttribute() 역할만 분리한 더 가벼운 객체다
		model.addAttribute("stu", stu);
		
		return "/test2/stuDetail";
	}
}






