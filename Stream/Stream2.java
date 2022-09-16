package StreamAPIJava8.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/*
*                   Java Stream Example: Filtering Collection by using Stream
*  Here, we are filtering data by using stream.
*  You can see that code is optimized and maintained. Stream provides fast execution.
*
* */
class StudentDetails{
    private Integer id;
    private String name;
    private Integer totalMarks;

    public StudentDetails(Integer id,String name,Integer totalMarks){
        this.id = id;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalMarks=" + totalMarks +
                '}';
    }
}
public class Stream2 {
    public static void main(String[] args) {
        List<StudentDetails> list = new ArrayList<>();
        list.add(new StudentDetails(1,"Saurabh",470));
        list.add(new StudentDetails(2,"Niketan",460));
        list.add(new StudentDetails(3,"Mona",480));
        list.add(new StudentDetails(4,"Poorva",496));
        list.add(new StudentDetails(5,"Sandesh",496));

        List<StudentDetails> student = list.stream().filter((e)->e.getTotalMarks()>475).collect(Collectors.toList());
        System.out.println(student);
    }
}
