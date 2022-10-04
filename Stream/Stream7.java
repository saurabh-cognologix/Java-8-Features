package StreamAPIJava8.Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
    /*
    * Float is of size 32 bits while double is of size 64 bits.
    * Hence, double can handle much bigger fractional numbers than float.
     * */
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        String placeHolder = "id:{0},name:{1},salary:{2}";
        return java.text.MessageFormat.format(placeHolder,id,name,salary);
    }
}
public class Stream7 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"Aaa",100.10));
        list.add(new Employee(2,"Bbb",200.0));
        list.add(new Employee(3,"Ccc",50.123));
        list.add(new Employee(3,"Ccc",50.123));
        Iterator<Employee> it = list.iterator();
        while (it.hasNext()){
            Employee e = it.next();
            System.out.println(e);
        }

        //converting employee list into set
        System.out.println("--------------------------------------------------");
        Set<Employee> set = list.stream().collect(Collectors.toSet());
        Iterator<Employee> itr = set.iterator();
        while (itr.hasNext()){
            Employee e = itr.next();
            System.out.println(e);
        }
    }
}
