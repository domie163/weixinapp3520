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


import com.dao.ShugenzongzhuangtaiDao;
import com.entity.ShugenzongzhuangtaiEntity;
import com.service.ShugenzongzhuangtaiService;
import com.entity.vo.ShugenzongzhuangtaiVO;
import com.entity.view.ShugenzongzhuangtaiView;

@Service("shugenzongzhuangtaiService")
public class ShugenzongzhuangtaiServiceImpl extends ServiceImpl<ShugenzongzhuangtaiDao, ShugenzongzhuangtaiEntity> implements ShugenzongzhuangtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShugenzongzhuangtaiEntity> page = this.selectPage(
                new Query<ShugenzongzhuangtaiEntity>(params).getPage(),
                new EntityWrapper<ShugenzongzhuangtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShugenzongzhuangtaiEntity> wrapper) {
		  Page<ShugenzongzhuangtaiView> page =new Query<ShugenzongzhuangtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShugenzongzhuangtaiVO> selectListVO(Wrapper<ShugenzongzhuangtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShugenzongzhuangtaiVO selectVO(Wrapper<ShugenzongzhuangtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShugenzongzhuangtaiView> selectListView(Wrapper<ShugenzongzhuangtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShugenzongzhuangtaiView selectView(Wrapper<ShugenzongzhuangtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
