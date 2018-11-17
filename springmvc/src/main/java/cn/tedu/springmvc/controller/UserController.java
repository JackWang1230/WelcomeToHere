package cn.tedu.springmvc.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
	
	@RequestMapping("/hobby")
	public String ss(){
		return "hobby";
	}

	@RequestMapping("/hobby.do")
	public String addUser(Model model,@RequestParam(value="hobbys",required = false) String[] hobby){
		String msg = Arrays.toString(hobby);
		model.addAttribute("msg", msg);

		return "home";
	}

}
