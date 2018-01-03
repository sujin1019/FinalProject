package com.scit.tandanzi.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.tandanzi.vo.UserVO;

@Repository
public class UserDAO implements UserMapper {
	
	@Autowired
	SqlSession sqlSession;
	public void UserInsert(UserVO user) {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		double calories = ((user.getWeight()*1000)/454)*18;
		
		double carbohy = calories*0.55;
		double protein = calories*0.25;
		double fat = calories*0.20;

		user.setCarbohy(carbohy);
		user.setProtein(protein);
		user.setFat(fat);
		
		System.out.println("Dao : "+user);
		mapper.UserInsert(user);
		
	}

	
}
