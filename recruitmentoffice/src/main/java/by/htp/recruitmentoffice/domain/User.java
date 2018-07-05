package by.htp.recruitmentoffice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table (name = "users")
public class User extends Entity{
	
	private static final long serialVersionUID = 8434182320643725079L;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "login")
	private String login;
	@Column(name = "password")
	private String password;
	@Column(name = "name")
	private String name;
	@Column(name = "surname")
	private String surname;
	@Column(name = "age")
	private String age;
	@Column(name = "registration")
	private String registration;
	@Column(name = "height")
	private String height;
	@Column(name = "weight")
	private String weight;
	@Column(name = "type_of_blood")
	private String type_of_blood;
	@Column(name = "skin_disease")
	private String skin_disease;
	@Column(name = "roles_id")
	private int roles_id;
	
	public User(int id, String login, String password, String name, String surname, String age, String registration, String height, String weight,
			String type_of_blood, String skin_disease, int roles_id) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.registration = registration;
		this.height = height;
		this.weight = weight;
		this.type_of_blood = type_of_blood;
		this.skin_disease = skin_disease;
		this.roles_id = roles_id;
	}

	public User() {
		
	}

	public User(int id) {
		super(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getType_of_blood() {
		return type_of_blood;
	}

	public void setType_of_blood(String type_of_blood) {
		this.type_of_blood = type_of_blood;
	}

	public String getSkin_disease() {
		return skin_disease;
	}

	public void setSkin_desease(String skin_desease) {
		this.skin_disease = skin_desease;
	}

	public int getRoles_id() {
		return roles_id;
	}

	public void setRoles_id(int roles_id) {
		this.roles_id = roles_id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + id;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((registration == null) ? 0 : registration.hashCode());
		result = prime * result + roles_id;
		result = prime * result + ((skin_disease == null) ? 0 : skin_disease.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + ((type_of_blood == null) ? 0 : type_of_blood.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
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
		User other = (User) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (id != other.id)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (registration == null) {
			if (other.registration != null)
				return false;
		} else if (!registration.equals(other.registration))
			return false;
		if (roles_id != other.roles_id)
			return false;
		if (skin_disease == null) {
			if (other.skin_disease != null)
				return false;
		} else if (!skin_disease.equals(other.skin_disease))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (type_of_blood == null) {
			if (other.type_of_blood != null)
				return false;
		} else if (!type_of_blood.equals(other.type_of_blood))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", login='" + login + '\'' +
				", password='" + password + '\'' +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", age='" + age + '\'' +
				", registration='" + registration + '\'' +
				", height='" + height + '\'' +
				", weight='" + weight + '\'' +
				", type_of_blood='" + type_of_blood + '\'' +
				", skin_desease='" + skin_disease + '\'' + 
				", roles_id=" + roles_id + 
				"}";
	}
	
}
