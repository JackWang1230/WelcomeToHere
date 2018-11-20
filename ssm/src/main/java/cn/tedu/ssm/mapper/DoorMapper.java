package cn.tedu.ssm.mapper;

import java.util.List;

import cn.tedu.ssm.pojo.Door;

public interface DoorMapper {
	//<select id="find" resultType="cn.tedu.ssm.pojo.Door">
	public List<Door> find(); //接口的抽象方法，在后面写具体实现类
	public void insert(Door door);
	public void update(Door door);
	public void delete(Integer id);
	public void deleteMuch(Integer[] a);
	public Door  get(Integer id);
}
