package hu.training.animal.insect;

import hu.training.animal.Flyable;

public class Hornet extends BaseInsect implements Insect, Flyable {

	public Hornet() {
		super(6);
	}

	public Hornet(int numberOfLegs) {
		super(numberOfLegs);

	}

	@Override
	public void eat() {
		System.out.println("Eating flower.");

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
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAnnoying() {
		// TODO Auto-generated method stub
		return false;
	}

}
