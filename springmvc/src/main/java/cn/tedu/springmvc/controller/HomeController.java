package cn.tedu.springmvc.controller;

import java.util.Arrays;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("hobby")
public class HomeController {
	@RequestMapping("/home")
	public String home(HttpSession session){
		session.setAttribute("msg", "你好呀");
		
		return "home";
	}
	
	@RequestMapping("/user")
	public String addaUser(Model model, String[] hobby){
		String[] msg = hobby;
		model.addAttribute("msg0", msg[0]);
		model.addAttribute("msg1", msg[1]);
		model.addAttribute("msg2", msg[2]);
		model.addAttribute("msg3", msg[3]);
		//System.out.println(msg);
		return "hobby";
	}
	



}
