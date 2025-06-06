package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ShumujuankuanEntity;
import com.entity.view.ShumujuankuanView;

import com.service.ShumujuankuanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 树木捐款
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-08 23:11:21
 */
@RestController
@RequestMapping("/shumujuankuan")
public class ShumujuankuanController {
    @Autowired
    private ShumujuankuanService shumujuankuanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShumujuankuanEntity shumujuankuan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			shumujuankuan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShumujuankuanEntity> ew = new EntityWrapper<ShumujuankuanEntity>();
		PageUtils page = shumujuankuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shumujuankuan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShumujuankuanEntity shumujuankuan, HttpServletRequest request){
        EntityWrapper<ShumujuankuanEntity> ew = new EntityWrapper<ShumujuankuanEntity>();
		PageUtils page = shumujuankuanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shumujuankuan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShumujuankuanEntity shumujuankuan){
       	EntityWrapper<ShumujuankuanEntity> ew = new EntityWrapper<ShumujuankuanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shumujuankuan, "shumujuankuan")); 
        return R.ok().put("data", shumujuankuanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShumujuankuanEntity shumujuankuan){
        EntityWrapper< ShumujuankuanEntity> ew = new EntityWrapper< ShumujuankuanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shumujuankuan, "shumujuankuan")); 
		ShumujuankuanView shumujuankuanView =  shumujuankuanService.selectView(ew);
		return R.ok("查询树木捐款成功").put("data", shumujuankuanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShumujuankuanEntity shumujuankuan = shumujuankuanService.selectById(id);
        return R.ok().put("data", shumujuankuan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShumujuankuanEntity shumujuankuan = shumujuankuanService.selectById(id);
        return R.ok().put("data", shumujuankuan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShumujuankuanEntity shumujuankuan, HttpServletRequest request){
    	shumujuankuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shumujuankuan);

        shumujuankuanService.insert(shumujuankuan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShumujuankuanEntity shumujuankuan, HttpServletRequest request){
    	shumujuankuan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shumujuankuan);

        shumujuankuanService.insert(shumujuankuan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShumujuankuanEntity shumujuankuan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shumujuankuan);
        shumujuankuanService.updateById(shumujuankuan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shumujuankuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ShumujuankuanEntity> wrapper = new EntityWrapper<ShumujuankuanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shumujuankuanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
