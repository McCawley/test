package hu.training.employee;

public class Developer extends BaseEmployee {
	private String favourite;

	public Developer(String name, int age, Gender gender) {
		super(name, age, gender);
	}

	@Override
	public void work(int hour) {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is coding " + hour + " hours a day");
	}

	public String getFavourite() {
		return favourite;
	}

	public void setFavourite(String favourite) {
		this.favourite = favourite;
	}
	

}
