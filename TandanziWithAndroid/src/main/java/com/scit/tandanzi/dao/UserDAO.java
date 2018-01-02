package com.scit.tandanzi.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.tandanzi.vo.User;

@Repository
public class UserDAO implements UserMapper {
	
	@Autowired
	SqlSession sqlSession;
	public int UserInsert(User user) {
		// TODO Auto-generated method stub
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		System.out.println("Dao : "+user);
		mapper.UserInsert(user);
		return 1;
	}

	
}
