package hu.training.employee;

public abstract class BaseEmployee implements Employee {
	private String name;
	private int age;
	private Gender gender;

	public BaseEmployee(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	@Override
	public void work(int hour) {
		System.out.println(name + " is working " + hour + " a day");

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	

}
