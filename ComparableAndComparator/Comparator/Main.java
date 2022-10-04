package StreamAPIJava8.ComparableAndComparator.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101,"Himanshu",500.30));
        employeeList.add(new Employee(106,"Saurabh",510.30));
        employeeList.add(new Employee(105,"Saonu",400.30));
        employeeList.add(new Employee(107,"Golu",500.30));
        employeeList.add(new Employee(104,"Monuee",500.30));

        System.out.println("Sorting on the basis of employee Name");
        Collections.sort(employeeList,new CompareByName());
        employeeList.forEach(System.out::println);

        System.out.println("Sorting on the basis of employee Id");
        Collections.sort(employeeList,new CompareById());
        employeeList.forEach(System.out::println);


    }
}
