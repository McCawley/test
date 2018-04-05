package hu.training.animal.insect;

public class Cricket extends BaseInsect {

	
	public Cricket(int numberOfLegs) {
		super(numberOfLegs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		System.out.println("Eating grass.");

	}

	@Override
	public long move() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Insect reproduce() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAnnoying() {
		// TODO Auto-generated method stub
		return false;
	}

}
