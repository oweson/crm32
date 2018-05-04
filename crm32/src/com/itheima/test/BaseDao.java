package com.itheima.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
* @author 作者程万里 E-mail1273919421@:
* @version 创建时间：2018年5月1日 上午10:00:45
* 类说明：侵权必究。。。。。。。
*/
/*用来配置spring junit启动加载配置*/
/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:spring/applicationContext-dao.xml",
		"classpath:spring/applicationContext-service.xml" })
public class BaseDao {

}
