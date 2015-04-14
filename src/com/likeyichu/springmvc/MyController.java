package com.likeyichu.springmvc;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.likeyichu.springmvc.bean.Book;

@Controller
public class MyController {
	@Resource
	private Book book;
	
	@ResponseBody
	@RequestMapping(value="/setPrice", method = {RequestMethod.GET}, produces="application/json;charset=UTF-8")
	//没有从对象到序列化内容的处理，这里会出错：
	//The resource identified by this request is only capable of generating responses with characteristics not acceptable according to the request "accept" headers.
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