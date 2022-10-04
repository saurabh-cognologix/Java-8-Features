package StreamAPIJava8.ComparableAndComparator.Comparator;

public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Double employeeSalary;

    public  Employee(Integer employeeId,String employeeName,Double employeeSalary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
    public Integer getEmployeeId(){
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    @Override
    public String toString(){
        String placeHolder = "Employee Id -> {0}, Employee Name ->{1}, Employee Salary ->{2}";
        return java.text.MessageFormat.format(placeHolder,employeeId,employeeName,employeeSalary);
    }
}
