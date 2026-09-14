package model;

public class Student extends Person {

    private String studentId;
    private String course;
    private int semester;
    private Marks marks;
    private Attendance attendance;

    public Student(String studentId, String name, int age,
                   String course, int semester) {

        super(name, age);

        this.studentId = studentId;
        this.course = course;
        this.semester = semester;
        this.marks = new Marks();
        this.attendance = new Attendance();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public void displayDetails() {

        System.out.println("------------------------------");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + getName());
        System.out.println("Age        : " + getAge());
        System.out.println("Course     : " + course);
        System.out.println("Semester   : " + semester);
        System.out.println("------------------------------");
    }
    public Marks getMarks() {
    return marks;
    }
    public Attendance getAttendance() {
    return attendance;
    }
}

