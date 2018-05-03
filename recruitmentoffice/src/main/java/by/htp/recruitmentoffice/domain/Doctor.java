package by.htp.recruitmentoffice.domain;

import java.util.Date;

public class Doctor extends Entity {

	private static final long serialVersionUID = 5146974182958964459L;
	
	private String name;
	private String surname;
	private String spec;
	private Date receiptTime;

	public Doctor() {
		super();
	}

	public Doctor(int id) {
		super(id);
	}

	public Doctor(int id, String name, String surname, String spec, Date receiptTime) {
		super(id);
		this.name = name;
		this.surname = surname;
		this.spec = spec;
		this.receiptTime = receiptTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public Date getReceiptTime() {
		return receiptTime;
	}

	public void setReceiptTime(Date receiptTime) {
		this.receiptTime = receiptTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * getId();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((receiptTime == null) ? 0 : receiptTime.hashCode());
		result = prime * result + ((spec == null) ? 0 : spec.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Doctor other = (Doctor) obj;
		if (getId() != other.getId()) {
			return false;
		} else if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (receiptTime == null) {
			if (other.receiptTime != null)
				return false;
		} else if (!receiptTime.equals(other.receiptTime))
			return false;
		if (spec == null) {
			if (other.spec != null)
				return false;
		} else if (!spec.equals(other.spec))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", surname=" + surname + ", spec=" + spec + ", receiptTime=" + receiptTime
				+ ", getId()=" + getId() + "]";
	}

	
}
