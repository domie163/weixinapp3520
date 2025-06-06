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


import com.dao.ShumulingquDao;
import com.entity.ShumulingquEntity;
import com.service.ShumulingquService;
import com.entity.vo.ShumulingquVO;
import com.entity.view.ShumulingquView;

@Service("shumulingquService")
public class ShumulingquServiceImpl extends ServiceImpl<ShumulingquDao, ShumulingquEntity> implements ShumulingquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShumulingquEntity> page = this.selectPage(
                new Query<ShumulingquEntity>(params).getPage(),
                new EntityWrapper<ShumulingquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShumulingquEntity> wrapper) {
		  Page<ShumulingquView> page =new Query<ShumulingquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShumulingquVO> selectListVO(Wrapper<ShumulingquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShumulingquVO selectVO(Wrapper<ShumulingquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShumulingquView> selectListView(Wrapper<ShumulingquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShumulingquView selectView(Wrapper<ShumulingquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
