package dto;

import java.io.Serializable;

public class MemberDto implements Serializable{
	private String name;
	private String age;
	
	public MemberDto() {
	}

	public MemberDto(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberDto [name=" + name + ", age=" + age + "]";
	}
	
	
}
