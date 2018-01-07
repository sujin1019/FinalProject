package com.scit.tandanzi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scit.tandanzi.dao.UserDAO;
import com.scit.tandanzi.vo.UserVO;

@Controller
public class UserController {

	@Autowired
	UserDAO userDao;

	@RequestMapping(value = "join", method = RequestMethod.GET)
	public @ResponseBody String join(UserVO user) {
		System.out.println(user);
		try {
			userDao.UserInsert(user);
		} catch (Exception e) {
			return "failed";
		}
		return "success";
	}
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	   public @ResponseBody String login(UserVO user) {
	      try {
	         System.out.println(user);
	         userDao.UserFind(user);
	      }catch(Exception e) {
	         return "failed";
	      }
	      
	      return "success";
	   }
}
