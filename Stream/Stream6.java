package StreamAPIJava8.Stream;

import java.util.ArrayList;
import java.util.*;



/*
*  Java Stream :Find Max and Min Product Price
*
* */
/*
* Find minimum and maximum marks obtained by a student.
*
* */
class MarksDetails{
    private Integer id;
    private String subject;
    private Float marks;

    public MarksDetails(Integer id, String subject, Float marks) {
        this.id = id;
        this.subject = subject;
        this.marks = marks;
    }

    public Float getMarks() {
        return marks;
    }

    @Override
    public String toString() {
       String placeHolder = "id:{0}, name:{1}, marks{2}";
       return java.text.MessageFormat.format(placeHolder,id,subject,marks);
    }
}
public class Stream6 {
    public static void main(String[] args) {
        List<MarksDetails> marks = new ArrayList<>();
        marks.add(new MarksDetails(1,"English",75.4F));
        marks.add(new MarksDetails(1,"Physics",71F));
        marks.add(new MarksDetails(1,"Chemistry",81.06F));
        marks.add(new MarksDetails(1,"Maths",91F));
        marks.add(new MarksDetails(1,"Physical Education",89F));

        // print object using iterator
 /*
        Iterator<MarksDetails> it = marks.iterator();
        while (it.hasNext()){
            MarksDetails md = it.next();
            System.out.println(md);
        }
*/
/*
         max() method to get maximum marks of a student
*/
        Float maxMarks = marks.stream().max((subject1, subject2)->subject1.getMarks() > subject2.getMarks() ? 1: -1).get().getMarks();
        System.out.println("Maximum marks of student is " +maxMarks);
/*
*       min() method to get minimum marks of a student
* */
        Float minMarks = marks.stream().min((subject1, subject2)->subject1.getMarks() > subject2.getMarks() ? 1: -1).get().getMarks();
        System.out.println("Minumum marks of student is " +minMarks);

/*
*       count() method to count the number of subject in which marks is less than 75
* */
        long countSubject = marks.stream().filter((e)->e.getMarks()<75).count();
        System.out.println("Subject in which marks is less then 75 is " +countSubject);
    }
}
