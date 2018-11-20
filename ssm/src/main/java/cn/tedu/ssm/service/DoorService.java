package cn.tedu.ssm.service;

import java.util.List;

import cn.tedu.ssm.pojo.Door;

public interface DoorService {
	
	public List<Door> find();
	public void insert(Door door);
	public void update(Door door);
	public void delete(Integer id);
	public void deleteMuch(Integer[] a);
	public Door get(Integer id);
}
