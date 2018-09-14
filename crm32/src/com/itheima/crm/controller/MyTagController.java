package com.itheima.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月8日 下午4:29:48 类说明：侵权必究。。。。。。。
 */
@Controller
public class MyTagController {
	@RequestMapping(value="/mytag")
	public String mytag() {
		return "mytag";
	}

}
