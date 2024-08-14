package com.ezen.springdata.mapper;


import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;


import com.ezen.springdata.dto.EmployeeDTO;
import com.ezen.springdata.dto.FruitDTO;


import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Repository
public class FruitsRepository {
	
	private final SqlSessionTemplate sql;
	
	public boolean add(FruitDTO fruitDTO) {
		return sql.insert("Fruits.add", fruitDTO) > 0;
	}
	
	public FruitDTO add2(FruitDTO fruitDTO) {
		sql.insert("Fruits.add2", fruitDTO);
		return fruitDTO;
	}
	
	public List<FruitDTO> getAll() {
		return sql.selectList("Fruits.getAll");
	}
	
	public boolean del(FruitDTO fruitDTO) {
		return sql.delete("Fruits.del", fruitDTO) > 0;
	}
	
	public boolean update(FruitDTO fruitDTO) {
		return sql.update("Fruits.upd", fruitDTO) > 0;
	}


}
