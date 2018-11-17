package cn.tedu.spring;

public class Dept {
	private Integer id;
	private String name;
	
	public Dept(Integer id,String name){
		this.id =id;
		this.name= name;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + "]";
	}
	
	
}
