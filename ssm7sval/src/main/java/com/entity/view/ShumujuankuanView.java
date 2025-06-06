package com.entity.view;

import com.entity.ShumujuankuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 树木捐款
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
@TableName("shumujuankuan")
public class ShumujuankuanView  extends ShumujuankuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShumujuankuanView(){
	}
 
 	public ShumujuankuanView(ShumujuankuanEntity shumujuankuanEntity){
 	try {
			BeanUtils.copyProperties(this, shumujuankuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
