package com.scit.tandanzi.dao;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.tandanzi.vo.SearchVO;
import com.scit.tandanzi.vo.SlListVO;

@Repository
public class ListDAO implements ListMapper {

	@Autowired
	SqlSession sqlSession;

	@Override
	public ArrayList<SlListVO> getFoodList(String slType) {
		ListMapper mapper = sqlSession.getMapper(ListMapper.class);
		String foodType = "";
		switch (slType) {
		case "kor":
			foodType = "한식";
			break;
		case "jap":
			foodType = "일식";
			break;
		case "chi":
			foodType = "중식";
			break;
		case "west":
			foodType = "양식";
			break;
		case "drinks":
			foodType = "음료";
			break;
		case "sweets":
			foodType = "디저트";
			break;
		}
		ArrayList<SlListVO> sllist = mapper.getFoodList(foodType);
		return sllist;
	}
}