package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuxinxitongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuxinxitongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuxinxitongjiView;


/**
 * 用户信息统计
 *
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface YonghuxinxitongjiService extends IService<YonghuxinxitongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuxinxitongjiVO> selectListVO(Wrapper<YonghuxinxitongjiEntity> wrapper);
   	
   	YonghuxinxitongjiVO selectVO(@Param("ew") Wrapper<YonghuxinxitongjiEntity> wrapper);
   	
   	List<YonghuxinxitongjiView> selectListView(Wrapper<YonghuxinxitongjiEntity> wrapper);
   	
   	YonghuxinxitongjiView selectView(@Param("ew") Wrapper<YonghuxinxitongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuxinxitongjiEntity> wrapper);
   	
}

