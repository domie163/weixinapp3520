package com.entity.view;

import com.entity.YonghuxinxitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户信息统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
@TableName("yonghuxinxitongji")
public class YonghuxinxitongjiView  extends YonghuxinxitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuxinxitongjiView(){
	}
 
 	public YonghuxinxitongjiView(YonghuxinxitongjiEntity yonghuxinxitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuxinxitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
