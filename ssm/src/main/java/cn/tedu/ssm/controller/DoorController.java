package cn.tedu.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String find(){
		List<Door> dataList = doorService.find();
		for (Door door : dataList) {
			System.out.println(door);
		}
		return "door/doorList";
	}
	
	@RequestMapping("/find1")
	@ResponseBody
	public List<Door> find1(){
		return doorService.find();
	}
}
