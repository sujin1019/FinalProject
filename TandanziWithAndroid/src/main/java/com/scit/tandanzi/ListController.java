package com.scit.tandanzi;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.scit.tandanzi.dao.ListDAO;
import com.scit.tandanzi.vo.SlListVO;

@Controller
public class ListController {

   @Autowired
   ListDAO listDAO;
   
   @RequestMapping(value="getFoodList", method=RequestMethod.GET)
   public @ResponseBody ArrayList<SlListVO> searchFood(String slType){
      System.out.println("slType=?"+slType);
      ArrayList<SlListVO> list = listDAO.getFoodList(slType);
      System.out.println(list);
      return list;
   }
}