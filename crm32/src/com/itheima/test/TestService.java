package com.itheima.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.service.CustomerService;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月1日 下午7:36:31 类说明：侵权必究。。。。。。。
 */

public class TestService extends BaseDao {
	@Autowired
	CustomerService customerService;

	@Test
	public void testService() {
		Customer selectCustomerById = customerService.selectCustomerById(15);
		System.out.println(selectCustomerById.toString());
	}

}
