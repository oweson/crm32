package com.itheima.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.crm.pojo.BaseDict;
import com.itheima.crm.service.MyBaseDictService;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月8日 下午5:16:33 类说明：侵权必究。。。。。。。
 */
@Controller
public class MyCustomerController {
	@Value("${fromtype.code}")
	private String code;
	// 从配置文件中得到信息解决硬编码；
	@Autowired
	private MyBaseDictService myBaseDictService;

	@SuppressWarnings("unused")
	@RequestMapping("showAll")
	public String showAllBadeDict() {
		List<BaseDict> showAllBasedict = myBaseDictService.showAllBasedict(null);
		List<BaseDict> showAllBasedict2 = myBaseDictService.showAllBasedict(null);
		List<BaseDict> showAllBasedict3 = myBaseDictService.showAllBasedict(null);
		return null;

	}

}
