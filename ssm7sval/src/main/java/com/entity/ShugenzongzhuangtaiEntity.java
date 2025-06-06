package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 树跟踪状态
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
@TableName("shugenzongzhuangtai")
public class ShugenzongzhuangtaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShugenzongzhuangtaiEntity() {
		
	}
	
	public ShugenzongzhuangtaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 树木编号
	 */
					
	private String shumubianhao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：树木编号
	 */
	public void setShumubianhao(String shumubianhao) {
		this.shumubianhao = shumubianhao;
	}
	/**
	 * 获取：树木编号
	 */
	public String getShumubianhao() {
		return shumubianhao;
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
