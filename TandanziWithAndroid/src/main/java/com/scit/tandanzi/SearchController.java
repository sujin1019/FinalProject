package com.scit.tandanzi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.scit.tandanzi.dao.SearchDAO;

@Controller
public class SearchController {

	@Autowired
	SearchDAO searchDAO;
	
	
}
