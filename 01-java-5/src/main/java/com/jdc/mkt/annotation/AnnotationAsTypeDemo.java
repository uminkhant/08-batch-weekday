package com.jdc.mkt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Messages({
	@Message(value = 3,text = "Hello text"),
	@Message(value = 5,text = "Hi" )
})
public class AnnotationAsTypeDemo {

	
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@interface Messages{
	Message[]value() default {};
}

@Repeatable(Messages.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@interface Message{
	int value() default 1;
	String text() default "No text";
}
