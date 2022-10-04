package StreamAPIJava8.ComparableAndComparator.Comparable2;

public class Student implements Comparable<Student> {
    private String StudnetName;
    private Integer StudentId;

    public Student(String studnetName, Integer studentId) {
        StudnetName = studnetName;
        StudentId = studentId;
    }

    public String getStudnetName() {
        return StudnetName;
    }

    public void setStudnetName(String studnetName) {
        StudnetName = studnetName;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudnetName='" + StudnetName + '\'' +
                ", StudentId=" + StudentId +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if(this.StudnetName.compareTo(student.StudnetName)!=0){
            return this.StudnetName.compareTo(student.StudnetName);
        }else{
            return this.StudentId-student.StudentId;
        }

    }
}
