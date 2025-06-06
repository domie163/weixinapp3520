package com.dao;

import com.entity.ShugenzongzhuangtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShugenzongzhuangtaiVO;
import com.entity.view.ShugenzongzhuangtaiView;


/**
 * 树跟踪状态
 * 
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface ShugenzongzhuangtaiDao extends BaseMapper<ShugenzongzhuangtaiEntity> {
	
	List<ShugenzongzhuangtaiVO> selectListVO(@Param("ew") Wrapper<ShugenzongzhuangtaiEntity> wrapper);
	
	ShugenzongzhuangtaiVO selectVO(@Param("ew") Wrapper<ShugenzongzhuangtaiEntity> wrapper);
	
	List<ShugenzongzhuangtaiView> selectListView(@Param("ew") Wrapper<ShugenzongzhuangtaiEntity> wrapper);

	List<ShugenzongzhuangtaiView> selectListView(Pagination page,@Param("ew") Wrapper<ShugenzongzhuangtaiEntity> wrapper);
	
	ShugenzongzhuangtaiView selectView(@Param("ew") Wrapper<ShugenzongzhuangtaiEntity> wrapper);
	
}
