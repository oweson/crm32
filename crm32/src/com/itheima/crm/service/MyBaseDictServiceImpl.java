package com.itheima.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.crm.mapper.MyBaseDictDao;
import com.itheima.crm.pojo.BaseDict;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月8日 下午5:15:07 类说明：侵权必究。。。。。。。
 */
@Service
public class MyBaseDictServiceImpl implements MyBaseDictService {
	@Autowired
	MyBaseDictDao myBaseDictDao;

	public List<BaseDict> showAllBasedict(String code) {
		// TODO Auto-generated method stub
		return myBaseDictDao.showAllDiseDict(code);
	}

}
