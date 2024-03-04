package com.jdc.mkt;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;

public class ApplicationServletListener implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("Application scope : Attribute added ");
	}
	
	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("Application scope : Attribute removed ");
	}
	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("Application scope : Attribute replaced ");
	}
}
