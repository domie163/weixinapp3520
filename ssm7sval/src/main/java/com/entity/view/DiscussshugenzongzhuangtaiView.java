package com.entity.view;

import com.entity.DiscussshugenzongzhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 树跟踪状态评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
@TableName("discussshugenzongzhuangtai")
public class DiscussshugenzongzhuangtaiView  extends DiscussshugenzongzhuangtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshugenzongzhuangtaiView(){
	}
 
 	public DiscussshugenzongzhuangtaiView(DiscussshugenzongzhuangtaiEntity discussshugenzongzhuangtaiEntity){
 	try {
			BeanUtils.copyProperties(this, discussshugenzongzhuangtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
