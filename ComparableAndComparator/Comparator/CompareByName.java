package StreamAPIJava8.ComparableAndComparator.Comparator;

import java.util.Comparator;

public class CompareByName implements Comparator<Employee> {

    @Override
    public int compare(Employee employee, Employee t1) {
        return employee.getEmployeeName().compareTo(t1.getEmployeeName());
    }
}
