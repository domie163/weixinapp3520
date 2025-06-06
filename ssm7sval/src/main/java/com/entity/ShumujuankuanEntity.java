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
 * 树木捐款
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
@TableName("shumujuankuan")
public class ShumujuankuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShumujuankuanEntity() {
		
	}
	
	public ShumujuankuanEntity(T t) {
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
	 * 捐款公告标题
	 */
					
	private String juankuangonggaobiaoti;
	
	/**
	 * 捐款内容
	 */
					
	private String juankuanneirong;
	
	/**
	 * 捐款价格
	 */
					
	private String juankuanjiage;
	
	/**
	 * 封面图
	 */
					
	private String fengmiantu;
	
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
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：捐款公告标题
	 */
	public void setJuankuangonggaobiaoti(String juankuangonggaobiaoti) {
		this.juankuangonggaobiaoti = juankuangonggaobiaoti;
	}
	/**
	 * 获取：捐款公告标题
	 */
	public String getJuankuangonggaobiaoti() {
		return juankuangonggaobiaoti;
	}
	/**
	 * 设置：捐款内容
	 */
	public void setJuankuanneirong(String juankuanneirong) {
		this.juankuanneirong = juankuanneirong;
	}
	/**
	 * 获取：捐款内容
	 */
	public String getJuankuanneirong() {
		return juankuanneirong;
	}
	/**
	 * 设置：捐款价格
	 */
	public void setJuankuanjiage(String juankuanjiage) {
		this.juankuanjiage = juankuanjiage;
	}
	/**
	 * 获取：捐款价格
	 */
	public String getJuankuanjiage() {
		return juankuanjiage;
	}
	/**
	 * 设置：封面图
	 */
	public void setFengmiantu(String fengmiantu) {
		this.fengmiantu = fengmiantu;
	}
	/**
	 * 获取：封面图
	 */
	public String getFengmiantu() {
		return fengmiantu;
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
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
