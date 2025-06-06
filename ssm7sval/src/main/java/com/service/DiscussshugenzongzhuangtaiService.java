package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshugenzongzhuangtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshugenzongzhuangtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshugenzongzhuangtaiView;


/**
 * 树跟踪状态评论表
 *
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface DiscussshugenzongzhuangtaiService extends IService<DiscussshugenzongzhuangtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshugenzongzhuangtaiVO> selectListVO(Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper);
   	
   	DiscussshugenzongzhuangtaiVO selectVO(@Param("ew") Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper);
   	
   	List<DiscussshugenzongzhuangtaiView> selectListView(Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper);
   	
   	DiscussshugenzongzhuangtaiView selectView(@Param("ew") Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper);
   	
}

