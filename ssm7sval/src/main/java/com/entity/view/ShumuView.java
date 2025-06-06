package com.entity.view;

import com.entity.ShumuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 树木
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
@TableName("shumu")
public class ShumuView  extends ShumuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShumuView(){
	}
 
 	public ShumuView(ShumuEntity shumuEntity){
 	try {
			BeanUtils.copyProperties(this, shumuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
