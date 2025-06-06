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


import com.dao.ShumujuankuanDao;
import com.entity.ShumujuankuanEntity;
import com.service.ShumujuankuanService;
import com.entity.vo.ShumujuankuanVO;
import com.entity.view.ShumujuankuanView;

@Service("shumujuankuanService")
public class ShumujuankuanServiceImpl extends ServiceImpl<ShumujuankuanDao, ShumujuankuanEntity> implements ShumujuankuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShumujuankuanEntity> page = this.selectPage(
                new Query<ShumujuankuanEntity>(params).getPage(),
                new EntityWrapper<ShumujuankuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShumujuankuanEntity> wrapper) {
		  Page<ShumujuankuanView> page =new Query<ShumujuankuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShumujuankuanVO> selectListVO(Wrapper<ShumujuankuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShumujuankuanVO selectVO(Wrapper<ShumujuankuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShumujuankuanView> selectListView(Wrapper<ShumujuankuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShumujuankuanView selectView(Wrapper<ShumujuankuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
