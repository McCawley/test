package hu.training.animal.insect;

public abstract class BaseInsect implements Insect {

	protected int numberOfLengs;
	
	public BaseInsect(int numberOfLegs) {
		super();
		this.numberOfLengs = numberOfLegs;
	}
	
	public int getNumberOfLengs() {
		return numberOfLengs;
	}

	public void setNumberOfLengs(int numberOfLengs) {
		this.numberOfLengs = numberOfLengs;
	}

	@Override
	public void eat() {
		System.out.println("Eating something.");

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

}
