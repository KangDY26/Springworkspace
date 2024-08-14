package com.ezen.springmvc.cook;

import org.springframework.stereotype.Component;

@Component
public class Cook {
	private String name;
	private Integer carrer;
	private String field;
	
	private Hotel hotel; // 의존 관계
	private Recipe recipe;
	
	// 1. 생성자는 @Autowired 없이도 자동으로 주입된다
	// 2. 필드 위에 @Autowired를 붙여도 주입된다
	// 3. Setter 메서드 위에 @Autowired를 붙여도 주입된다
	public Cook(Hotel hotel, Recipe recipe) {
		this.hotel = hotel;
		this.recipe = recipe;
	}

	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCarrer() {
		return carrer;
	}
	public void setCarrer(Integer carrer) {
		this.carrer = carrer;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Recipe getRecipe() {
		return recipe;
	}
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}


	@Override
	public String toString() {
		return "Cook [name=" + name + ", carrer=" + carrer + ", field=" + field + ", hotel=" + hotel + ", recipe="
				+ recipe + "]";
	}

	

	
	
}
