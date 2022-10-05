package StreamAPIJava8.ToMap;

import StreamAPIJava8.ToMap.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(2,"Bbbc",456));
        arrayList.add(new Student(3,"Cccc",458));
        arrayList.add(new Student(4,"AAc",486));
        arrayList.add(new Student(1,"Dc",457));
        arrayList.add(new Student(6,"Bbc",362));
        arrayList.add(new Student(5,"Xyc",400));

    //Function.identity() method simply returns a function that always returns its input argument.

        Map<Integer,Student> tempMap = arrayList.stream()
                .collect(Collectors.toMap(
                        Student::getStudentId,
                        Function.identity()

                ));
        tempMap.forEach((k,v)-> System.out.println(k+"  :  "+v));
    }
}
