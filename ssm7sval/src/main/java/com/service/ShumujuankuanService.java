package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShumujuankuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShumujuankuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShumujuankuanView;


/**
 * 树木捐款
 *
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public interface ShumujuankuanService extends IService<ShumujuankuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShumujuankuanVO> selectListVO(Wrapper<ShumujuankuanEntity> wrapper);
   	
   	ShumujuankuanVO selectVO(@Param("ew") Wrapper<ShumujuankuanEntity> wrapper);
   	
   	List<ShumujuankuanView> selectListView(Wrapper<ShumujuankuanEntity> wrapper);
   	
   	ShumujuankuanView selectView(@Param("ew") Wrapper<ShumujuankuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShumujuankuanEntity> wrapper);
   	
}

