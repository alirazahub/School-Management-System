public class Student extends Person implements Comparable<Student>
{
    private int StudentId;
    private String status;
    public Assessments assessment;



    public Student(int studentId , String name, int age, String gender , Address add , Assessments assessment)
    {
        super(name, age, add, gender);
        StudentId = studentId;
        this.assessment = assessment;
    }

    public Student(int studentId , String name, int age, String gender , Address add)
    {
        super(name, age, add, gender);
        StudentId = studentId;
    }

    public void setId(int id)
    {
        StudentId = id;
    }
    public int getId()
    {
        return StudentId;
    }

    public void setAssessment(Assessments assessment)
    {
        this.assessment = assessment;
    }
    public Assessments getAssessment()
    {
        return assessment;
    }

    public String getStatus()
    {
        double marks = assessment.calculate_total();
        if(marks < 50)
        {
            status = "Fail!";
            return status;
        }
        status = "Pass!";
        return status;
    }

    @Override
    public int compareTo(Student s)
    {
        if(this.StudentId == s.getId())
        {
            return 0;
        }
        if(this.StudentId < s.getId())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", status='" + status + '\'' +
                ", assessment=" + assessment +
                '}';
    }
}