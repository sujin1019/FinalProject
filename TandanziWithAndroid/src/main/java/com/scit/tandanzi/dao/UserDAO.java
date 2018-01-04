package com.scit.tandanzi.dao;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.tandanzi.vo.UserVO;

@Repository
public class UserDAO implements UserMapper {
	
	@Autowired
	SqlSession sqlSession;
	public int UserInsert(UserVO user) {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		double calories = ((user.getWeight()*1000)/454)*18;
		
		double carbohy = Math.round(calories*0.55*100)/100.0;
		double protein = Math.round(calories*0.25*100)/100.0;
		double fat = Math.round(calories*0.20*100)/100.0;

		user.setCarbohy(carbohy);
		user.setProtein(protein);
		user.setFat(fat);
		
		return mapper.UserInsert(user);
		
	}
	
	public void UserFind(String id,String pw,UserVO user) {
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		if(id==user.getId()||pw==user.getPw()) {
			System.out.println("로그인되었습니다.");
		}
		
	}

	
}
