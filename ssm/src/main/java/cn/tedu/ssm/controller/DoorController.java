package cn.tedu.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.ssm.pojo.Door;
import cn.tedu.ssm.service.DoorService;

@Controller
@RequestMapping("/door")
public class DoorController {
	@Autowired  //DI 它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作
	private DoorService doorService;
	
	@RequestMapping("/find")
	public String find( Model model,Door door){
		List<Door> dataList = doorService.find();
		model.addAttribute("doorList", dataList);
	
		return "door/doorList";
	}
	
	@RequestMapping("/find1")
	@ResponseBody
	public List<Door> find1(){
		return doorService.find();
	}
	@RequestMapping("toAdd")
	public String add(){
		return "/door/doorAdd";
	}
	
	@RequestMapping("/insert")
	public String insert(Door door){
		doorService.insert(door);
		return "redirect:/door/find";  //代表的是此时走的是 localhost:8060/door/find
	}
	
	@RequestMapping("/toUpdate")
	public String toUpdate(Model model, Integer id){
		Door door = doorService.get(id);
		model.addAttribute("door", door);
		return "/door/doorUpdate";
	}
	
	@RequestMapping("/update")
	public String update(Door door){
		doorService.update(door);
		return "redirect:/door/find";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer id){
		doorService.delete(id);
		return "redirect:/door/find";	
	}
	
	@RequestMapping("/deteMuch")
	public String deleteMuch(Integer[]a){
		doorService.deleteMuch(a);
		return "/door/doorList";
	}
}
