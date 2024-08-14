package com.ezen.springdata.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ezen.springdata.dto.FruitDTO;
import com.ezen.springdata.repository.FruitRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FruitService {
	private final FruitRepository fruitRepository;

	public List<FruitDTO> getAll(){
		return fruitRepository.getAll();
	}
}
