package com.dao;

import com.entity.SuoshukeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SuoshukeVO;
import com.entity.view.SuoshukeView;


/**
 * 所属科
 * 
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface SuoshukeDao extends BaseMapper<SuoshukeEntity> {
	
	List<SuoshukeVO> selectListVO(@Param("ew") Wrapper<SuoshukeEntity> wrapper);
	
	SuoshukeVO selectVO(@Param("ew") Wrapper<SuoshukeEntity> wrapper);
	
	List<SuoshukeView> selectListView(@Param("ew") Wrapper<SuoshukeEntity> wrapper);

	List<SuoshukeView> selectListView(Pagination page,@Param("ew") Wrapper<SuoshukeEntity> wrapper);
	
	SuoshukeView selectView(@Param("ew") Wrapper<SuoshukeEntity> wrapper);
	
}
