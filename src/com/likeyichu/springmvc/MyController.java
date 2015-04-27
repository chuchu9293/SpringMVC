package com.likeyichu.springmvc;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.likeyichu.springmvc.bean.Book;

@Controller
public class MyController {
	@Resource
	private Book book;
	
	@ResponseBody
	@RequestMapping(value="/setPrice", method = {RequestMethod.GET}, produces="application/json;charset=UTF-8")
	public Book fun(HttpServletRequest request, HttpServletResponse response){
		Double price=Double.valueOf(request.getParameter("price"));
		book.setPrice(price);
		return book;
	}
	
	@ResponseBody
	@RequestMapping(value="/setPrice2", method = {RequestMethod.GET}, produces="application/json;charset=UTF-8")
	public String fun2(HttpServletRequest request, HttpServletResponse response){
		Double price=Double.valueOf(request.getParameter("price"));
		book.setPrice(price);
		return price.toString();
	}
}