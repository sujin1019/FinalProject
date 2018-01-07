package com.scit.tandanzi.dao;

import java.util.ArrayList;

import com.scit.tandanzi.vo.SearchVO;

public interface SearchMapper {

	ArrayList<SearchVO> searchFood(String trim);

}
