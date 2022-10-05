package StreamAPIJava8.ToMap;

import StreamAPIJava8.ToMap.model.Student;


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(2,"Zxy",456));
        arrayList.add(new Student(3,"Cccc",458));
        arrayList.add(new Student(4,"AAc",486));
        arrayList.add(new Student(1,"Dc",457));
        arrayList.add(new Student(1,"Bbc",362));
        arrayList.add(new Student(5,"Xyc",400));
        arrayList.add(new Student(2,"Bba",456));

        // TreeMap example
        // converting duplicate keys into the TreeMap
        Map<Integer,String> treeMap = arrayList.stream()
                .collect(Collectors.toMap(
                        Student::getStudentId,
                        Student::getStudentName,
                        (s,a)->s+" , "+a,
                        TreeMap::new
                ));
        treeMap.forEach((k,v)-> System.out.println(k+"  :  "+v));
    }
}
