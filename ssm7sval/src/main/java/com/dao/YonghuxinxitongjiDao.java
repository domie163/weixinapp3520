package com.dao;

import com.entity.YonghuxinxitongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuxinxitongjiVO;
import com.entity.view.YonghuxinxitongjiView;


/**
 * 用户信息统计
 * 
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface YonghuxinxitongjiDao extends BaseMapper<YonghuxinxitongjiEntity> {
	
	List<YonghuxinxitongjiVO> selectListVO(@Param("ew") Wrapper<YonghuxinxitongjiEntity> wrapper);
	
	YonghuxinxitongjiVO selectVO(@Param("ew") Wrapper<YonghuxinxitongjiEntity> wrapper);
	
	List<YonghuxinxitongjiView> selectListView(@Param("ew") Wrapper<YonghuxinxitongjiEntity> wrapper);

	List<YonghuxinxitongjiView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuxinxitongjiEntity> wrapper);
	
	YonghuxinxitongjiView selectView(@Param("ew") Wrapper<YonghuxinxitongjiEntity> wrapper);
	
}
