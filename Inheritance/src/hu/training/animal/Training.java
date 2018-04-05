package hu.training.animal;

import java.util.ArrayList;
import java.util.List;

import hu.training.animal.insect.BaseInsect;
import hu.training.animal.insect.Cricket;
import hu.training.animal.insect.Hornet;
import hu.training.animal.insect.Insect;

public class Training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insect hornet = new Hornet();
		Cricket cricket = new Cricket(4);
		
		BaseInsect cricket2 = new Cricket(6);
		
		System.out.println(cricket.getNumberOfLengs());
		System.out.println(cricket2.getNumberOfLengs());
		
		List<Insect> list = new ArrayList<>();
		list.add(hornet);
		list.add(cricket);
		list.add(cricket2);
		list.forEach(insect -> insect.eat());
		
		Flyable hornetFlyable = (Flyable) hornet;
		hornetFlyable.fly();
	}

}
