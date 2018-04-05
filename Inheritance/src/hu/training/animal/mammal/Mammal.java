package hu.training.animal.mammal;

import hu.training.animal.Animal;

public interface Mammal extends Animal {
	@Override
	Mammal reproduce();
}
