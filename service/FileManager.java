package service;

import model.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileManager {

    private static final String FILE_NAME =
            "student_records.txt";

    public void saveStudent(Student student) {

        try (PrintWriter writer =
                     new PrintWriter(
                             new FileWriter(FILE_NAME, true))) {

            writer.println("--------------------------------");
            writer.println("Student ID : "
                    + student.getStudentId());

            writer.println("Name       : "
                    + student.getName());

            writer.println("Age        : "
                    + student.getAge());

            writer.println("Course     : "
                    + student.getCourse());

            writer.println("Semester   : "
                    + student.getSemester());

            writer.println("Marks      : "
                    + student.getMarks().getSubjectMarks());

            writer.printf(
                    "Average    : %.2f%n",
                    student.getMarks().calculateAverage()
            );

            writer.printf(
                    "Attendance : %.2f%%%n",
                    student.getAttendance()
                            .calculatePercentage()
            );

            writer.println("--------------------------------");

            System.out.println(
                    "Student record saved successfully."
            );

        } catch (IOException e) {

            System.out.println(
                    "Error while saving student record: "
                            + e.getMessage()
            );
        }
    }
}
