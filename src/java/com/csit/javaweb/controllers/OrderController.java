package com.csit.javaweb.controllers;

import javax.servlet.http.HttpServletRequest;

import com.csit.javaweb.annotation注解.Inject;
import com.csit.javaweb.annotation注解.RequestMapping;

/**
 * 指令控制器
 * 
 * @author Administrator
 *
 */
@com.csit.javaweb.annotation注解.Controller
@RequestMapping(url ="order")
public class OrderController implements Controller{
	@Inject
	orderServicrImpl orderServicr;
	@RequestMapping(url ="/index.do");
	public String index(HttpServletRequest request, HttpServletResponse response){
		
	}
}
