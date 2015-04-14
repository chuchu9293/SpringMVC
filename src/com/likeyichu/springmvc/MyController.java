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
//	@Autowired
//	private CacheManager cacheManager;
	
	@ResponseBody
	@RequestMapping(value="/setPrice", method = {RequestMethod.GET}, produces="application/json;charset=UTF-8")
	public Book setBwg(HttpServletRequest request, HttpServletResponse response){
		Double price=Double.valueOf(request.getParameter("price"));
		book.setPrice(price);
		return book;
	}
	/*
	@ResponseBody
	@RequestMapping(value="/removeblockip", method = {RequestMethod.POST}, produces="application/json;charset=UTF-8")
	public String removeblockip(@RequestParam String ip, HttpServletRequest request, HttpServletResponse response){
		String result = null;
		try{
			 result = bwgService.removeblockip(ip);
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}*/
}