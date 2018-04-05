package hu.training;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import hu.training.employee.Employee;
import hu.training.employee.Person;

public class LambdaTest {

	public interface Add {
		public Integer add(Integer a, Integer b);
	}

	public static void main(String[] args) {
		Consumer<String> consumer = (value) -> {
			System.out.println(value);
		};
		Consumer<String> consumerRef = System.out::println;
		consumer.accept("value");
		consumerRef.accept("Method reference");
		Add add = (a, b) -> {
			return a + b;
		};

		System.out.println(add.add(10, 10));

		Add addRef = LambdaTest::add;

		System.out.println(addRef.add(20, 20));

		Collection<Employee> employees = new ArrayList<>();

		employees.add(new Employee("Béla", 30));
		employees.add(new Employee("Sanyi", 20));
		employees.add(new Employee("Józsi", 35));
		employees.add(new Employee("Karcsi", 19));

		employees.forEach(x -> {
			String value = x.getName() + " " + x.getAge();
			System.out.println(value);
		});

		List<Employee> filterEmployee = employees.stream().filter(x -> x.getAge() < 31).collect(Collectors.toList());
		System.out.println(filterEmployee);

		boolean present = employees.stream().filter(x -> x.getAge() < 31).findAny().isPresent();
		System.out.println(present);

		 employees.stream().map(Person::new).collect(Collectors.toList());

		 employees.stream().sorted().forEach(System.out::println);

	}

	public static Integer add(Integer a, Integer b) {
		return a + b;
	}

}
