package StreamAPIJava8.ToMap;

import StreamAPIJava8.ToMap.model.Student;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(2,"Bbbc",456));
        arrayList.add(new Student(3,"Cccc",458));
        arrayList.add(new Student(4,"AAc",486));
        arrayList.add(new Student(1,"Dc",457));
        arrayList.add(new Student(1,"Bbc",362));
        arrayList.add(new Student(5,"Xyc",400));
        arrayList.forEach(System.out::println);

        Map<Integer,String> newMap = arrayList.stream()
                .collect(Collectors.toMap(
                        Student::getStudentId,
                        Student::getStudentName,
                        (s, a) -> s + ", " + a
                ));
        newMap.forEach((k,v)-> System.out.println(k+" : "+v));

    }
}
