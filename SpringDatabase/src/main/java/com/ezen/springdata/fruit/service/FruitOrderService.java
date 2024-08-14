package com.ezen.springdata.fruit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ezen.springdata.dto.FruitDTO;
import com.ezen.springdata.dto.FruitSalesHistoryDTO;
import com.ezen.springdata.fruit.repository.FruitOrderRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class FruitOrderService {
	
	private final FruitOrderRepository fruitOrderRepository;
	
	public List<FruitDTO> list(){
		
		// DB에서 모든 주문 목록을 꺼내 와야한다
		return fruitOrderRepository.getAll();
	}
	

	
	
	public void saleFruit(Integer fid, Integer qty) {
		// 1. 과일의 개수를 차감해야한다
			fruitOrderRepository.reduceFruit(fid, qty);			
		
		// 2. 판매 내역 테이블에 판매 정보를 추가한다
			fruitOrderRepository.addHistory(fid, qty);
		
		
		// 3. 회원이었다면 구매액에 비례해 마일리지 포인트를 증가시킨다
		
	}

}
