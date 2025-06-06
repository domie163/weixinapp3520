package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YonghuxinxitongjiDao;
import com.entity.YonghuxinxitongjiEntity;
import com.service.YonghuxinxitongjiService;
import com.entity.vo.YonghuxinxitongjiVO;
import com.entity.view.YonghuxinxitongjiView;

@Service("yonghuxinxitongjiService")
public class YonghuxinxitongjiServiceImpl extends ServiceImpl<YonghuxinxitongjiDao, YonghuxinxitongjiEntity> implements YonghuxinxitongjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuxinxitongjiEntity> page = this.selectPage(
                new Query<YonghuxinxitongjiEntity>(params).getPage(),
                new EntityWrapper<YonghuxinxitongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuxinxitongjiEntity> wrapper) {
		  Page<YonghuxinxitongjiView> page =new Query<YonghuxinxitongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuxinxitongjiVO> selectListVO(Wrapper<YonghuxinxitongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuxinxitongjiVO selectVO(Wrapper<YonghuxinxitongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuxinxitongjiView> selectListView(Wrapper<YonghuxinxitongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuxinxitongjiView selectView(Wrapper<YonghuxinxitongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
