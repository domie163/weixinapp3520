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
 * 树木
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
@TableName("shumu")
public class ShumuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShumuEntity() {
		
	}
	
	public ShumuEntity(T t) {
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
