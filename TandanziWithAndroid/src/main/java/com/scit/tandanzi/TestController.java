package com.scit.tandanzi;


import java.util.ArrayList;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scit.tandanzi.dao.UserDAO;
import com.scit.tandanzi.vo.User;



/**
 * Handles requests for the application home page.
 */
@Controller
public class TestController {
	@Autowired
	UserDAO userDao;
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	
	
	@RequestMapping(value="/jsontest",method=RequestMethod.GET)
	@ResponseBody
	public ArrayList<User> JasonTest(){
		ArrayList<User> arraylist = new ArrayList<User>();
		
		arraylist.add(new User(1,"홍길동","010-1111-1111"));
		arraylist.add(new User(2,"최다흰","010-4659-2517"));
		arraylist.add(new User(3,"손미정","010-5293-4517"));
		
		return arraylist;
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	@ResponseBody
	public String LoginGet(String email, String password ){
		
		System.out.println(email+", "+password);
		
		return "Success";
	}
	
	// 사용자 등록
		@RequestMapping(value = "/join", method = RequestMethod.GET)
		public String join() {
			User user = new User(2,"lee", "012-111-1111");
			int result = userDao.UserInsert(user);
			System.out.println("result : "+result+"\n");
			return "redirect:/";
		}
	
}
