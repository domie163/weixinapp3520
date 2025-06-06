package com.entity.vo;

import com.entity.ShumuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 树木
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public class ShumuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 树木名称
	 */
	
	private String shumumingcheng;
		
	/**
	 * 所属科
	 */
	
	private String suoshuke;
		
	/**
	 * 所属目
	 */
	
	private String suoshumu;
		
	/**
	 * 树木详情
	 */
	
	private String shumuxiangqing;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 树木图片
	 */
	
	private String shumutupian;
				
	
	/**
	 * 设置：树木名称
	 */
	 
	public void setShumumingcheng(String shumumingcheng) {
		this.shumumingcheng = shumumingcheng;
	}
	
	/**
	 * 获取：树木名称
	 */
	public String getShumumingcheng() {
		return shumumingcheng;
	}
				
	
	/**
	 * 设置：所属科
	 */
	 
	public void setSuoshuke(String suoshuke) {
		this.suoshuke = suoshuke;
	}
	
	/**
	 * 获取：所属科
	 */
	public String getSuoshuke() {
		return suoshuke;
	}
				
	
	/**
	 * 设置：所属目
	 */
	 
	public void setSuoshumu(String suoshumu) {
		this.suoshumu = suoshumu;
	}
	
	/**
	 * 获取：所属目
	 */
	public String getSuoshumu() {
		return suoshumu;
	}
				
	
	/**
	 * 设置：树木详情
	 */
	 
	public void setShumuxiangqing(String shumuxiangqing) {
		this.shumuxiangqing = shumuxiangqing;
	}
	
	/**
	 * 获取：树木详情
	 */
	public String getShumuxiangqing() {
		return shumuxiangqing;
	}
				
	
	/**
	 * 设置：注意事项
	 */
	 
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
	}
				
	
	/**
	 * 设置：树木图片
	 */
	 
	public void setShumutupian(String shumutupian) {
		this.shumutupian = shumutupian;
	}
	
	/**
	 * 获取：树木图片
	 */
	public String getShumutupian() {
		return shumutupian;
	}
			
}
