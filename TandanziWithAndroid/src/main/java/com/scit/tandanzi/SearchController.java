package com.scit.tandanzi;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scit.tandanzi.dao.SearchDAO;
import com.scit.tandanzi.vo.SearchVO;

@Controller
public class SearchController {

	@Autowired
	SearchDAO searchDAO;
	
	@RequestMapping(value="search", method=RequestMethod.GET)
	public @ResponseBody ArrayList<SearchVO> searchFood(String foodname){
		ArrayList<SearchVO> sv = searchDAO.searchFood(foodname);
		return sv;
	}
}
