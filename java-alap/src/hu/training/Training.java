package hu.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import hu.training.duplicate.again.DuplicateAgain;
import static java.lang.Math.PI;
import static hu.training.duplicate.again.DuplicateAgain.staticImport;
import hu.training.duplicate.again.Inheritance;

public class Training {
	// Oszt�lyszint� v�ltoz�
	public static int osztalySzintu = 5;

	// oszt�lyszint�
	static {
		osztalySzintu = 1;
	}

	// p�ld�nyszint�
	private int peldany = 5;

	{
		peldany = 10;
	}

	public Training(int peldany) {
		super();
		this.peldany = peldany;
	}

	public void doIt() {
		System.out.println("Do it!");
	}

	public static void main(String[] args) {
		System.out.println(osztalySzintu);

		Training training = new Training(15);
		System.out.println(training.peldany);

		// lok�lis v�ltoz�
		int lokalis = 5;
		System.out.println(lokalis);

		// t�mb
		int[] tomb = new int[10];
		System.out.println(tomb[0]);

		if (training instanceof Training) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		int kifejezes = lokalis * 10;

		training.doIt();
		doItAgain();

		Collection<String> collection = new ArrayList<>();
		collection.add("Egy");
		collection.add("Kett�");
		collection.add("H�rom");
		collection.add("N�gy");

		for (String x : collection) {
			System.out.println(x);
		}
		

		Outside: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 6) {
					break Outside;
				}

				System.out.println(i + " - " + j);

			}

		}

		finallyTest();

		hu.training.duplicate.Training training2 = new hu.training.duplicate.Training();
		DuplicateAgain foo = new DuplicateAgain();

		// importtal
		System.out.println(PI);

		// import n�lk�l
		System.out.println(Math.PI);

		// static importtal a DuplicatedAgain class-b�l
		staticImport();
//		Inheritance inh = new Inheritance().newInheritance();
	}

	///////////////////////////////////

	public static void doItAgain() {
		System.out.println("Do it again!");
	}

	public static void finallyTest() {
		try {
			System.out.println("Try");
			throw new RuntimeException();
		} catch (Exception e) {

		} finally {
			System.out.println("finally");
		}
	}
}
