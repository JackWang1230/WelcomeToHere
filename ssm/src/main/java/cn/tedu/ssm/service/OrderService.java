package cn.tedu.ssm.service;

import java.util.List;

import cn.tedu.ssm.pojo.Order;

public interface OrderService {
	public List<Order> find();
	public void insert(Order order);
	public Order get(Integer id);
	public void update(Order order);
	
	public void delete (Integer id);
}
