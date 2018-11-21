package cn.tedu.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.ssm.mapper.OrderMapper;
import cn.tedu.ssm.pojo.Order;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;
	
	public List<Order> find(){
		return orderMapper.find();
	} 
	public void insert(Order order){
		orderMapper.insert(order);
	}
	
	public Order get(Integer id){
		return orderMapper.get(id);
		
	}
	
	public void update(Order order){
		orderMapper.update(order);
	}
	
	public void delete (Integer id){
		orderMapper.delete(id);
	}
}
