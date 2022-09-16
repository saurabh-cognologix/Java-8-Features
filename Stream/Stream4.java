package StreamAPIJava8.Stream;
/*
*  Q: Print id and name of student whose makrs age less than 450;
* */

// Filtering and Iterating Collection
import java.util.*;
import java.util.stream.Collectors;

class StudentMarks{
    private Integer stuId;
    private String name;
    private Integer marks;

    public StudentMarks(Integer stuId,String name,Integer marks){
        this.stuId = stuId;
        this.name = name;
        this.marks = marks;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Stream4 {
    public static void main(String[] args) {
        List<StudentMarks> studentMarks= new ArrayList<>();
        studentMarks.add(new StudentMarks(1,"AAA",478));
        studentMarks.add(new StudentMarks(2,"BBB",460));
        studentMarks.add(new StudentMarks(3,"CCC",480));
        studentMarks.add(new StudentMarks(4,"EEE",430));
        studentMarks.add(new StudentMarks(5,"DDD",449));
        studentMarks.stream().filter((e)->e.getMarks()<=450).forEach(s-> System.out.println(s.getStuId()+" "+s.getName()));
    }
}
