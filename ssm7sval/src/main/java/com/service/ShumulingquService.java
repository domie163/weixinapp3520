package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShumulingquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShumulingquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShumulingquView;


/**
 * 树木领取
 *
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface ShumulingquService extends IService<ShumulingquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShumulingquVO> selectListVO(Wrapper<ShumulingquEntity> wrapper);
   	
   	ShumulingquVO selectVO(@Param("ew") Wrapper<ShumulingquEntity> wrapper);
   	
   	List<ShumulingquView> selectListView(Wrapper<ShumulingquEntity> wrapper);
   	
   	ShumulingquView selectView(@Param("ew") Wrapper<ShumulingquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShumulingquEntity> wrapper);
   	
}

