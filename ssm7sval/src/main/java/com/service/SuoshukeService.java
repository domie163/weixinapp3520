package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SuoshukeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SuoshukeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SuoshukeView;


/**
 * 所属科
 *
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface SuoshukeService extends IService<SuoshukeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SuoshukeVO> selectListVO(Wrapper<SuoshukeEntity> wrapper);
   	
   	SuoshukeVO selectVO(@Param("ew") Wrapper<SuoshukeEntity> wrapper);
   	
   	List<SuoshukeView> selectListView(Wrapper<SuoshukeEntity> wrapper);
   	
   	SuoshukeView selectView(@Param("ew") Wrapper<SuoshukeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SuoshukeEntity> wrapper);
   	
}

