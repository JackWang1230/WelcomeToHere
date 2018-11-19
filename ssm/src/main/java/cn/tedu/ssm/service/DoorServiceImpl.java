package cn.tedu.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tedu.ssm.mapper.DoorMapper;
import cn.tedu.ssm.pojo.Door;

@Service //标识这是一个业务实现类，注解，包扫描创建这个实例，管理者spring
public class DoorServiceImpl implements DoorService {
	@Autowired //调用，注入映射，DI，底层spring就调用对应set方法
	private DoorMapper doorMapper; //这个实现类的目的就是将持久层和业务层进行结合起来，其中的 DoorMapper接口和 DoorService接口的方法时相同的
	
		
	public List<Door> find(){
		return doorMapper.find();
	}
	
}
