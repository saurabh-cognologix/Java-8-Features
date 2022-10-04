package StreamAPIJava8.ComparableAndComparator.Comparator;

import java.util.Comparator;

public class CompareById implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee e){
        return employee.getEmployeeId().compareTo(e.getEmployeeId());
    }
}
