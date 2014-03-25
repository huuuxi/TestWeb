package com.huuuxi.test.http.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author wyliujiangbin
 *分三类：ServletContextListener；HttpSessionListener ；HttpRequestListener ；
 *	按照属性来分：Attribute；Event；
 */
public class TestServletContextListener	 implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
