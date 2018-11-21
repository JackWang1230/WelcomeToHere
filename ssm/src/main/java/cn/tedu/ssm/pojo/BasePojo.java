package cn.tedu.ssm.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BasePojo implements Serializable {
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date created;
	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date updated;
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
}
