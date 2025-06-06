package com.dao;

import com.entity.ShumujuankuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShumujuankuanVO;
import com.entity.view.ShumujuankuanView;


/**
 * 树木捐款
 * 
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface ShumujuankuanDao extends BaseMapper<ShumujuankuanEntity> {
	
	List<ShumujuankuanVO> selectListVO(@Param("ew") Wrapper<ShumujuankuanEntity> wrapper);
	
	ShumujuankuanVO selectVO(@Param("ew") Wrapper<ShumujuankuanEntity> wrapper);
	
	List<ShumujuankuanView> selectListView(@Param("ew") Wrapper<ShumujuankuanEntity> wrapper);

	List<ShumujuankuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShumujuankuanEntity> wrapper);
	
	ShumujuankuanView selectView(@Param("ew") Wrapper<ShumujuankuanEntity> wrapper);
	
}
