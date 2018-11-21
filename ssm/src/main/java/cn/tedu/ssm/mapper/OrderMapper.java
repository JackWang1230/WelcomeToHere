package cn.tedu.ssm.mapper;

import java.util.List;

import cn.tedu.ssm.pojo.Order;

public interface OrderMapper {
	
	public List<Order> find();
	public void insert(Order order);
	public Order get(Integer id);
	public void update(Order order);
	
	public void delete(Integer id);
}
