package cn.tedu.ssm.mapper;

import java.util.List;

import cn.tedu.ssm.pojo.Door;

public interface DoorMapper {
	//<select id="find" resultType="cn.tedu.ssm.pojo.Door">
	public List<Door> find(); //接口的抽象方法，在后面写具体实现类
}
