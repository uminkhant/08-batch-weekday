package com.jdc.mkt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class CustomAnnoDemo {
	
	void main() throws NoSuchFieldException, SecurityException {
		var user = getUser(new Admin());
		System.out.println(user.getUserName());
	}

	public User getUser(Object obj) throws NoSuchFieldException, SecurityException {
		Field field = obj.getClass().getDeclaredField("user");
		CusAnno ano = field.getAnnotation(CusAnno.class);
		if(null != ano) {
			var user = new User();
			user.setUserName(ano.user());
			user.setPassword(ano.password());
			return user;
		}
		return null;
	}
}

class User {
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

class Admin {
	@CusAnno(user = "admin", password = "123")
	private User user;
	

}

class Customer {
	@CusAnno(user = "member", password = "222")
	private User user;
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD })
@interface CusAnno {
	String user();

	String password();
}