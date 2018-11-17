package cn.tedu.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
	private String name;
	private String age;
	
	//类关联
	private Dog dog;
	
	private List list;
	private Set set;
	private Map map;
	private Properties dbparas;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getDbparas() {
		return dbparas;
	}
	public void setDbparas(Properties dbparas) {
		this.dbparas = dbparas;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", dog=" + dog + ", list=" + list + ", set=" + set + ", map="
				+ map + ", dbparas=" + dbparas + "]";
	}


}
