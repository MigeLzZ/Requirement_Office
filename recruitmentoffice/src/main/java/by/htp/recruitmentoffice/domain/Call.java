package by.htp.recruitmentoffice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@javax.persistence.Entity
public class Call extends Entity{
	
	private static final long serialVersionUID = 1064486110479654895L;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "year")
	private int year;
	@Column(name = "company")
	private String company;
	
	public Call() {
	}
	
	public Call(int id) {
		super(id);
	}
	public Call(int id, int year, String company) {
		super();
		this.id = id;
		this.year = year;
		this.company = company;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + id;
		result = prime * result + year;
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
		Call other = (Call) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (id != other.id)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Call{" +
				"id=" + id + 
				", year=" + year + 
				", company='" + company + '\'' +
				"}";
	}
	
}
