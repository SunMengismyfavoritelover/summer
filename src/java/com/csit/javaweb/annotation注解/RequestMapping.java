package com.csit.javaweb.annotation◊¢Ω‚;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * «Î«Û”≥…‰
 * @author Administrator
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD,ElementType.TYPE })
public @interface RequestMapping {
	String url() default "";
}

