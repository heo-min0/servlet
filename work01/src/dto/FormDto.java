package dto;

import java.io.Serializable;

public class FormDto implements Serializable {
	private String name;
	private String ages;
	private String sex;
	private String hobby;
	
	public FormDto() {
	}

	public FormDto(String name, String ages, String sex, String hobby) {
		this.name = name;
		this.ages = ages;
		this.sex = sex;
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "FormDto [name=" + name + ", ages=" + ages + ", sex=" + sex + ", hobby=" + hobby + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAges() {
		return ages;
	}

	public void setAges(String ages) {
		this.ages = ages;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
