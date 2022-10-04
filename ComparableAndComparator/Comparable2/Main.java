package StreamAPIJava8.ComparableAndComparator.Comparable2;
/*

Given a List consisting of two fields of type string and integer.
You have to sort the array in ascending Lexicographical order and
if two strings are the same sort it based on their integer value.

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("abc",3));
        studentList.add(new Student("a",4));
        studentList.add(new Student("bc",5));
        studentList.add(new Student("a",2));

        studentList.forEach(System.out::println);

        System.out.println("After Sorting :");

        Collections.sort(studentList);

        studentList.forEach(System.out::println);


    }
}
