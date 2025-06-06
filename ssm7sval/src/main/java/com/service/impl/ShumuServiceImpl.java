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


import com.dao.ShumuDao;
import com.entity.ShumuEntity;
import com.service.ShumuService;
import com.entity.vo.ShumuVO;
import com.entity.view.ShumuView;

@Service("shumuService")
public class ShumuServiceImpl extends ServiceImpl<ShumuDao, ShumuEntity> implements ShumuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShumuEntity> page = this.selectPage(
                new Query<ShumuEntity>(params).getPage(),
                new EntityWrapper<ShumuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShumuEntity> wrapper) {
		  Page<ShumuView> page =new Query<ShumuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShumuVO> selectListVO(Wrapper<ShumuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShumuVO selectVO(Wrapper<ShumuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShumuView> selectListView(Wrapper<ShumuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShumuView selectView(Wrapper<ShumuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
