package hu.training;

import java.util.ArrayList;
import java.util.List;

import hu.training.employee.BaseEmployee;
import hu.training.employee.Developer;
import hu.training.employee.Employee;
import hu.training.employee.Gender;

public class Training {

    public static void main(String[] args) {
//		new Training().createAdam();

        int a = 10;
        int b = 5;
        int c = 2;
        System.out.println(a * b + c);
        System.out.println("asd");
    }

    private void createAdam() {

        Employee adam = new Developer("Adam", 20, Gender.MALE);
        Employee adam3 = new Developer("Adam2", 21, Gender.MALE);
        BaseEmployee adam2 = ((BaseEmployee) adam);
        adam2.setAge(21);
        Employee adam4 = null;
//		adam4.work(10);
        adam.work(8);
        adam2.work(10);

    }

}
