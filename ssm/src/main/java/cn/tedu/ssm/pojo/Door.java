package cn.tedu.ssm.pojo;

public class Door extends BasePojo{
	private Integer id;
	private String name;
	private String tel;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Door [id=" + id + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
}
