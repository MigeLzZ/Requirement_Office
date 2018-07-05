package by.htp.recruitmentoffice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@javax.persistence.Entity
public class Schedule extends Entity{
	
	private static final long serialVersionUID = 5081344743098348819L;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "date")
	private String date;
	@Column(name = "time_slot")
	private String time_slot;
	@Column(name = "user_id")
	private Integer user_id;
	@Column(name = "doctors_id")
	private int doctors_id;
	
	
	public Schedule() {
		super();
	}

	public Schedule(int id) {
		super(id);
	}

	public Schedule(int id, String date, String time_slot, Integer user_id, int doctors_id) {
		super();
		this.id = id;
		this.date = date;
		this.time_slot = time_slot;
		this.user_id = user_id;
		this.doctors_id = doctors_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime_slot() {
		return time_slot;
	}

	public void setTime_slot(String time_slot) {
		this.time_slot = time_slot;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public int getDoctors_id() {
		return doctors_id;
	}

	public void setDoctors_id(int doctors_id) {
		this.doctors_id = doctors_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + doctors_id;
		result = prime * result + id;
		result = prime * result + ((time_slot == null) ? 0 : time_slot.hashCode());
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
		Schedule other = (Schedule) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (doctors_id != other.doctors_id)
			return false;
		if (id != other.id)
			return false;
		if (time_slot == null) {
			if (other.time_slot != null)
				return false;
		} else if (!time_slot.equals(other.time_slot))
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Schedule{" +
				"id=" + id + 
				", date=" + date + 
				", time_slot=" + time_slot + 
				", user_id=" + user_id + 
				", doctors_id=" + doctors_id +
				"}";
	}

}
