package com.ezen.springdata.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ezen.springdata.service.FruitService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HelloController {
	private final FruitService fruitService;

	@GetMapping("/fruit/list")
	public String hello(Model model) {
		model.addAttribute("fruits", fruitService.getAll());
		return "/fruit/list";
	}
	
/*
  	@RequiredArgsConstructor : 인스턴스 자동 생성
 
	1. 홈페이지 접속
	2. Controller 호출됨 @Controller 어노테이션
	3. Serivce 호출됨 @Service 어노테이션
	4. Repository 호출됨 @Repository 어노테이션
	5. mapper에 등록된 쿼리문 호출됨
*/
	
}
