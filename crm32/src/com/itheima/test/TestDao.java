package com.itheima.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.itheima.crm.mapper.BaseDictDao;
import com.itheima.crm.mapper.CustomerDao;
import com.itheima.crm.pojo.Customer;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月1日 上午10:03:41 类说明：侵权必究。。。。。。。
 */

public class TestDao extends BaseDao {
	@Autowired
	BaseDictDao BaseDao;
	@Autowired
	CustomerDao customedaa;

	@Test
	public void hahha() {
		//customedaa.
		Customer selectCustomerById = customedaa.selectCustomerById(15);
		System.out.println(selectCustomerById.toString());
	}

	@Test
	public void TestSth() {
		System.out.println("hello");
	}

}
