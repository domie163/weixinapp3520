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


import com.dao.DiscussshugenzongzhuangtaiDao;
import com.entity.DiscussshugenzongzhuangtaiEntity;
import com.service.DiscussshugenzongzhuangtaiService;
import com.entity.vo.DiscussshugenzongzhuangtaiVO;
import com.entity.view.DiscussshugenzongzhuangtaiView;

@Service("discussshugenzongzhuangtaiService")
public class DiscussshugenzongzhuangtaiServiceImpl extends ServiceImpl<DiscussshugenzongzhuangtaiDao, DiscussshugenzongzhuangtaiEntity> implements DiscussshugenzongzhuangtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshugenzongzhuangtaiEntity> page = this.selectPage(
                new Query<DiscussshugenzongzhuangtaiEntity>(params).getPage(),
                new EntityWrapper<DiscussshugenzongzhuangtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper) {
		  Page<DiscussshugenzongzhuangtaiView> page =new Query<DiscussshugenzongzhuangtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshugenzongzhuangtaiVO> selectListVO(Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshugenzongzhuangtaiVO selectVO(Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshugenzongzhuangtaiView> selectListView(Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshugenzongzhuangtaiView selectView(Wrapper<DiscussshugenzongzhuangtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
