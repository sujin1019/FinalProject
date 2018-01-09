package com.scit.tandanzi.dao;

import java.util.ArrayList;

import com.scit.tandanzi.vo.SlListVO;

public interface ListMapper {
   ArrayList<SlListVO> getFoodList(String slType);
}