package cn.tedu.springmvc.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tedu.springmvc.pojo.User;
@Controller
@RequestMapping("/user")
public class UserChangController {
	
	@RequestMapping("/update")
	public String update(Model model,User user){
		
		model.addAttribute("u",user);
		
		return "/user/user";
	}
	
	@InitBinder	//日期转换设定，只在本controller生效
	public void InitBinder (ServletRequestDataBinder binder){
		binder.registerCustomEditor(
		java.util.Date.class, 
		new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"), true));
	}
}
