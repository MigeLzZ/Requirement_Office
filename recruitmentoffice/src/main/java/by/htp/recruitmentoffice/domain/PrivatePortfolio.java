package by.htp.recruitmentoffice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@javax.persistence.Entity
public class PrivatePortfolio extends Entity{

	private static final long serialVersionUID = -4661039887557842341L;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "call_id")
	private int call_id;
	@Column(name = "user_id")
	private int user_id;
	
	public PrivatePortfolio() {
		super();
	}
	
	public PrivatePortfolio(int id) {
		super(id);
	}

	public PrivatePortfolio(int id, int call_id, int user_id) {
		super();
		this.id = id;
		this.call_id = call_id;
		this.user_id = user_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCall_id() {
		return call_id;
	}

	public void setCall_id(int call_id) {
		this.call_id = call_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + call_id;
		result = prime * result + id;
		result = prime * result + user_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrivatePortfolio other = (PrivatePortfolio) obj;
		if (call_id != other.call_id)
			return false;
		if (id != other.id)
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PrivatePortfolio{" +
				"id=" + id + 
				", call_id=" + call_id + 
				", user_id=" + user_id +
				"}";
	}
	
}
