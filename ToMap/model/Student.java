package StreamAPIJava8.ToMap.model;

public class Student {
    private Integer studentId;
    private String  studentName;
    private Integer studentMarks;

    public Student(Integer studentId,String studentName, Integer studentMarks){
        this.studentId =studentId;
        this.studentName=studentName;
        this.studentMarks = studentMarks;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public Integer getStudentMarks(){
        return studentMarks;
    }

   /* @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentMarks=" + studentMarks +
                '}';
    }*/

    @Override
    public String toString(){
        String placeHolder = "Student Id : {0}, Student Name = {1}, Student Marks = {2}";
        return java.text.MessageFormat.format(placeHolder,studentId,studentName,studentMarks);
    }
}
