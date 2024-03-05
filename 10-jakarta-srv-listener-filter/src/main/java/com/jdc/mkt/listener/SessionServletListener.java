package com.jdc.mkt.listener;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class SessionServletListener implements HttpSessionListener{

	public SessionServletListener() {
		System.out.println("Session servlet listener obj created ");
	}
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("session obj created");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("session obj destroyed ");
	}
	
}
