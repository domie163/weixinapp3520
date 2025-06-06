package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShumuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShumuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShumuView;


/**
 * 树木
 *
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface ShumuService extends IService<ShumuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShumuVO> selectListVO(Wrapper<ShumuEntity> wrapper);
   	
   	ShumuVO selectVO(@Param("ew") Wrapper<ShumuEntity> wrapper);
   	
   	List<ShumuView> selectListView(Wrapper<ShumuEntity> wrapper);
   	
   	ShumuView selectView(@Param("ew") Wrapper<ShumuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShumuEntity> wrapper);
   	
}

