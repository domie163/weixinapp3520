package com.entity.vo;

import com.entity.ShugenzongzhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 树跟踪状态
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
public class ShugenzongzhuangtaiVO  implements Serializable {
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
	 * 树木健康评估
	 */
	
	private String shumujiankangpinggu;
		
	/**
	 * 近期图片上传
	 */
	
	private String jinqitupianshangchuan;
		
	/**
	 * 数龄
	 */
	
	private String shuling;
		
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
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：树木健康评估
	 */
	 
	public void setShumujiankangpinggu(String shumujiankangpinggu) {
		this.shumujiankangpinggu = shumujiankangpinggu;
	}
	
	/**
	 * 获取：树木健康评估
	 */
	public String getShumujiankangpinggu() {
		return shumujiankangpinggu;
	}
				
	
	/**
	 * 设置：近期图片上传
	 */
	 
	public void setJinqitupianshangchuan(String jinqitupianshangchuan) {
		this.jinqitupianshangchuan = jinqitupianshangchuan;
	}
	
	/**
	 * 获取：近期图片上传
	 */
	public String getJinqitupianshangchuan() {
		return jinqitupianshangchuan;
	}
				
	
	/**
	 * 设置：数龄
	 */
	 
	public void setShuling(String shuling) {
		this.shuling = shuling;
	}
	
	/**
	 * 获取：数龄
	 */
	public String getShuling() {
		return shuling;
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
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
