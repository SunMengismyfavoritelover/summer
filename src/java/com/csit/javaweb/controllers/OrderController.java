package com.csit.javaweb.controllers;

import javax.servlet.http.HttpServletRequest;

import com.csit.javaweb.annotationע��.Inject;
import com.csit.javaweb.annotationע��.RequestMapping;

/**
 * ָ�������
 * 
 * @author Administrator
 *
 */
@com.csit.javaweb.annotationע��.Controller
@RequestMapping(url ="order")
public class OrderController implements Controller{
	@Inject
	orderServicrImpl orderServicr;
	@RequestMapping(url ="/index.do");
	public String index(HttpServletRequest request, HttpServletResponse response){
		
	}
}
