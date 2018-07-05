package by.htp.recruitmentoffice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "doctors")
public class Doctor extends Entity {

	private static final long serialVersionUID = 7853224977530357724L;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "surname")
	private String surname;
	@Column(name = "spec")
	private String spec;
	@Column(name = "receiptTime")
	private String receiptTime;

	public Doctor() {
		super();
	}

	public Doctor(int id) {
		super(id);
	}

	public Doctor(int id, String name, String surname, String spec, String receiptTime) {
		super(id);
		this.name = name;
		this.surname = surname;
		this.spec = spec;
		this.receiptTime = receiptTime;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getReceiptTime() {
		return receiptTime;
	}

	public void setReceiptTime(String receiptTime) {
		this.receiptTime = receiptTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + id;
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
		if (id != other.id)
			return false;
		if (name == null) {
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
		return "Doctor{" +
				"id=" + id + 
				", name='" + name + '\'' + 
				", surname'=" + surname + '\'' +
				", spec='" + spec + '\'' +
				", receiptTime=" + receiptTime + 
				"}";
	}
	
}
