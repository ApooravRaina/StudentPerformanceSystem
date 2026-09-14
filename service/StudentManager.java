package service;

import exception.InvalidStudentException;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student)
            throws InvalidStudentException {

        if (findStudent(student.getStudentId()) != null) {

            throw new InvalidStudentException(
                    "Student ID already exists."
            );
        }

        students.add(student);

        System.out.println(
                "Student added successfully."
        );
    }

    public Student findStudent(String studentId) {

        for (Student student : students) {

            if (student.getStudentId()
                    .equalsIgnoreCase(studentId)) {

                return student;
            }
        }

        return null;
    }

    public boolean deleteStudent(String studentId) {

        Student student = findStudent(studentId);

        if (student != null) {

            students.remove(student);

            return true;
        }

        return false;
    }

    public void displayAllStudents() {

        if (students.isEmpty()) {

            System.out.println(
                    "No students available."
            );

            return;
        }

        System.out.println(
                "\n===== ALL STUDENTS ====="
        );

        for (Student student : students) {

            student.displayDetails();
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}
