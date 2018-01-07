package com.scit.tandanzi.dao;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.tandanzi.vo.SearchVO;

@Repository
public class SearchDAO implements SearchMapper{

	@Autowired
	SqlSession sqlSession;

	public ArrayList<SearchVO> searchFood(String foodname) {
		SearchMapper mapper = sqlSession.getMapper(SearchMapper.class);
		
		ArrayList<SearchVO> sv = mapper.searchFood(foodname.trim());
		return sv;
	}
}
