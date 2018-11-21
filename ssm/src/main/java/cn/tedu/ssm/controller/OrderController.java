package cn.tedu.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tedu.ssm.pojo.Door;
import cn.tedu.ssm.pojo.Order;
import cn.tedu.ssm.service.DoorService;
import cn.tedu.ssm.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	@Autowired
	private DoorService doorerService;
	
	@RequestMapping("/find")
	public String find(Model model,Order order){
		List<Order> datalist = orderService.find();
		model.addAttribute("orderList", datalist);
		return "/order/orderList";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd(Model model, Door door){
		List<Door> doorList = doorerService.find();
		model.addAttribute("doorList", doorList);
		return "/order/orderAdd";
	}
	
	@RequestMapping("/insert")
	public String insert(Order order){
		orderService.insert(order);
		
		return "redirect:/order/find";
	}
	
	@RequestMapping("/toUpdate")
	public String toUpdate(Model model ,Integer id){
		//准备修改的对象
		Order order = orderService.get(id);
		model.addAttribute("order", order);
		
		//准备下拉框
		List<Door> dataList = doorerService.find();
		model.addAttribute("doorList", dataList);
		
		return "/order/orderUpdate";
	}
	
	@RequestMapping("/update")
	public String update(Order order){
		orderService.update(order);
		
		return "redirect:/order/find";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer id){
		orderService.delete(id);
		return "redirect:/order/find";
	}
	
}
