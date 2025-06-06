package com.dao;

import com.entity.ShumulingquEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShumulingquVO;
import com.entity.view.ShumulingquView;


/**
 * 树木领取
 * 
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface ShumulingquDao extends BaseMapper<ShumulingquEntity> {
	
	List<ShumulingquVO> selectListVO(@Param("ew") Wrapper<ShumulingquEntity> wrapper);
	
	ShumulingquVO selectVO(@Param("ew") Wrapper<ShumulingquEntity> wrapper);
	
	List<ShumulingquView> selectListView(@Param("ew") Wrapper<ShumulingquEntity> wrapper);

	List<ShumulingquView> selectListView(Pagination page,@Param("ew") Wrapper<ShumulingquEntity> wrapper);
	
	ShumulingquView selectView(@Param("ew") Wrapper<ShumulingquEntity> wrapper);
	
}
