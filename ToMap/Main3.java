package StreamAPIJava8.ToMap;

import StreamAPIJava8.ToMap.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(2,"Zxy",456));
        arrayList.add(new Student(3,"Cccc",458));
        arrayList.add(new Student(4,"AAc",486));
        arrayList.add(new Student(1,"Dc",457));
        arrayList.add(new Student(1,"Bbc",362));
        arrayList.add(new Student(5,"Xyc",400));
        arrayList.add(new Student(2,"Bba",456));

        // ConcurrentHashMap example
        // converting duplicate keys into the ConcurrentHashMap
        System.out.println("converting duplicate keys into the ConcurrentHashMap: ");
        Map<Integer,String> concurrentHashMap = arrayList.stream()
                .collect(Collectors.toMap(
                        Student::getStudentId,
                        Student::getStudentName,
                        (s,a)->s+" , "+a,
                        ConcurrentHashMap::new
                ));
        concurrentHashMap.forEach((k,v)-> System.out.println(k+"  :  "+v));
    }
}
