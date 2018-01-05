package com.scit.tandanzi.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SearchDAO implements SearchMapper{

	@Autowired
	SqlSession sqlSession;
	
	public void method(){
		SearchMapper mapper = sqlSession.getMapper(SearchMapper.class);
		
	}
}
