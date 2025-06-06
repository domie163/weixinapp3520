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


import com.dao.SuoshukeDao;
import com.entity.SuoshukeEntity;
import com.service.SuoshukeService;
import com.entity.vo.SuoshukeVO;
import com.entity.view.SuoshukeView;

@Service("suoshukeService")
public class SuoshukeServiceImpl extends ServiceImpl<SuoshukeDao, SuoshukeEntity> implements SuoshukeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SuoshukeEntity> page = this.selectPage(
                new Query<SuoshukeEntity>(params).getPage(),
                new EntityWrapper<SuoshukeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SuoshukeEntity> wrapper) {
		  Page<SuoshukeView> page =new Query<SuoshukeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SuoshukeVO> selectListVO(Wrapper<SuoshukeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SuoshukeVO selectVO(Wrapper<SuoshukeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SuoshukeView> selectListView(Wrapper<SuoshukeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SuoshukeView selectView(Wrapper<SuoshukeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
