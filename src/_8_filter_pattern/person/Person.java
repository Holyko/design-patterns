package _8_filter_pattern.person;

public class Person {

	public Person(String name, String sex, String age, String identity) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		Identity = identity;
	}

	private String name;

	private String sex;

	private String age;

	private String Identity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getIdentity() {
		return Identity;
	}

	public void setIdentity(String identity) {
		Identity = identity;
	}

	@Override
	public String toString() {
		return "Person{" +
						"name='" + name + '\'' +
						", sex='" + sex + '\'' +
						", age='" + age + '\'' +
						", Identity='" + Identity + '\'' +
						'}';
	}
}
