package com.entity.model;

import com.entity.ShumulingquEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 树木领取
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public class ShumulingquModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 所属目
	 */
	
	private String suoshumu;
		
	/**
	 * 所属科
	 */
	
	private String suoshuke;
		
	/**
	 * 树木图片
	 */
	
	private String shumutupian;
		
	/**
	 * 树木名称
	 */
	
	private String shumumingcheng;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 年级专业
	 */
	
	private String nianjizhuanye;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：年级专业
	 */
	 
	public void setNianjizhuanye(String nianjizhuanye) {
		this.nianjizhuanye = nianjizhuanye;
	}
	
	/**
	 * 获取：年级专业
	 */
	public String getNianjizhuanye() {
		return nianjizhuanye;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
