package com.ezen.springmvc.cook;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Recipe {

	String food_name;
	String[] gradients;
	String[] cooking_process;
}
