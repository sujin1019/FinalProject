package com.scit.tandanzi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.tandanzi.dao.UserDAO;
import com.scit.tandanzi.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired UserDAO userDao;
	
	@RequestMapping(value="join", method=RequestMethod.GET)
	public String join(UserVO user){
		System.out.println("확인");
		userDao.UserInsert(user);
		
		
		return "";
	}
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login(UserVO user) {
		userDao.UserFind(user);
	}
}
