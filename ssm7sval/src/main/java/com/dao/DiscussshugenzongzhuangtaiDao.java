package com.dao;

import com.entity.DiscussshugenzongzhuangtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshugenzongzhuangtaiVO;
import com.entity.view.DiscussshugenzongzhuangtaiView;


/**
 * 树跟踪状态评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface DiscussshugenzongzhuangtaiDao extends BaseMapper<DiscussshugenzongzhuangtaiEntity> {
	
	List<DiscussshugenzongzhuangtaiVO> selectListVO(@Param("ew") Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper);
	
	DiscussshugenzongzhuangtaiVO selectVO(@Param("ew") Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper);
	
	List<DiscussshugenzongzhuangtaiView> selectListView(@Param("ew") Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper);

	List<DiscussshugenzongzhuangtaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper);
	
	DiscussshugenzongzhuangtaiView selectView(@Param("ew") Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper);
	
}
