package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShugenzongzhuangtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShugenzongzhuangtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShugenzongzhuangtaiView;


/**
 * 树跟踪状态
 *
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface ShugenzongzhuangtaiService extends IService<ShugenzongzhuangtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShugenzongzhuangtaiVO> selectListVO(Wrapper<ShugenzongzhuangtaiEntity> wrapper);
   	
   	ShugenzongzhuangtaiVO selectVO(@Param("ew") Wrapper<ShugenzongzhuangtaiEntity> wrapper);
   	
   	List<ShugenzongzhuangtaiView> selectListView(Wrapper<ShugenzongzhuangtaiEntity> wrapper);
   	
   	ShugenzongzhuangtaiView selectView(@Param("ew") Wrapper<ShugenzongzhuangtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShugenzongzhuangtaiEntity> wrapper);
   	
}

