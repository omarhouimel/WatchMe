package watch.me.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Comment implements Serializable {
	@Id @GeneratedValue
	private Long id;
	private String body;
	@Temporal(TemporalType.DATE)
	private Date date;
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public Comment(String body, Date date) {
		super();
		this.body = body;
		this.date = date;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
