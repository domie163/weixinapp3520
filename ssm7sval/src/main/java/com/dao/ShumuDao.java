package com.dao;

import com.entity.ShumuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShumuVO;
import com.entity.view.ShumuView;


/**
 * 树木
 * 
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface ShumuDao extends BaseMapper<ShumuEntity> {
	
	List<ShumuVO> selectListVO(@Param("ew") Wrapper<ShumuEntity> wrapper);
	
	ShumuVO selectVO(@Param("ew") Wrapper<ShumuEntity> wrapper);
	
	List<ShumuView> selectListView(@Param("ew") Wrapper<ShumuEntity> wrapper);

	List<ShumuView> selectListView(Pagination page,@Param("ew") Wrapper<ShumuEntity> wrapper);
	
	ShumuView selectView(@Param("ew") Wrapper<ShumuEntity> wrapper);
	
}
