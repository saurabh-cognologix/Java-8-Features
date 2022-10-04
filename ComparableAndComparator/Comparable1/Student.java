package StreamAPIJava8.ComparableAndComparator.Comparable1;

public class Student implements Comparable<Student> {
    private Integer studentId;
    private String studentName;
    private Integer studnetMarks;

    public Student(Integer studentId,String studentName,Integer studnetMarks){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studnetMarks = studnetMarks;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getStudnetMarks() {
        return studnetMarks;
    }

    @Override
    public String toString() {
        String placeHoder = "Studnet Id : {0}, Student Name : {1}, Student Marks : {2}";
        return java.text.MessageFormat.format(placeHoder,studentId,studentName,studnetMarks);

    }

    @Override
    public int compareTo(Student student) {
        return this.studnetMarks-student.studnetMarks;
    }
}
