public class Teacher extends Person implements Comparable<Teacher> {
    private int TeacherId;
    private String subject;

    public Teacher(int teacherId, String name, int age, String gender, String Subject, Address add) {
        super(name, age, add, gender);
        TeacherId = teacherId;
        subject = Subject;
    }

    public int getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(int teacherId) {
        TeacherId = teacherId;
    }

    public String getTeacherSubject() {
        return subject;
    }

    public void setTeacherSubject(String Subject) {
        subject = Subject;
    }

    @Override
    public int compareTo(Teacher t) {
        if (this.TeacherId == t.getTeacherId()) {
            return 0;
        }
        if (this.TeacherId < t.getTeacherId()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TeacherId=" + TeacherId +
                ", subject='" + subject + '\'' +
                '}';
    }
}
