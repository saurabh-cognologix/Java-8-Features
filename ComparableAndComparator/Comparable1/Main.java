package StreamAPIJava8.ComparableAndComparator.Comparable1;
/*
sorting the student list on the basis of marks
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(4,"Sohan",455));
        studentList.add(new Student(3,"Hola",458));
        studentList.add(new Student(1,"SenaNayak",455));
        studentList.add(new Student(2,"Motilala",478));
        //sorting the student list on the basis of marks
        //It is used to sort the elements present in the specified list of Collection in ascending order.
        Collections.sort(studentList);
        studentList.forEach(System.out::println);
    }
}
