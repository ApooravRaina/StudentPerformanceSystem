package service;

import model.Student;

public class PerformanceAnalyzer {

    public double calculatePercentage(Student student) {

        return student.getMarks().calculateAverage();
    }

    public String calculateGrade(Student student) {

        double percentage = calculatePercentage(student);

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public String getPerformanceStatus(Student student) {

        double percentage = calculatePercentage(student);

        double attendance =
                student.getAttendance().calculatePercentage();

        if (percentage >= 50 && attendance >= 75) {
            return "PASS";
        }

        return "FAIL";
    }

    public void displayPerformance(Student student) {

        double percentage =
                calculatePercentage(student);

        String grade =
                calculateGrade(student);

        String status =
                getPerformanceStatus(student);

        double attendance =
                student.getAttendance().calculatePercentage();

        System.out.println("\n================================");
        System.out.println("       PERFORMANCE REPORT");
        System.out.println("================================");

        System.out.println(
                "Student ID : " + student.getStudentId()
        );

        System.out.println(
                "Name       : " + student.getName()
        );

        System.out.printf(
                "Percentage : %.2f%%%n",
                percentage
        );

        System.out.println(
                "Grade      : " + grade
        );

        System.out.printf(
                "Attendance : %.2f%%%n",
                attendance
        );

        System.out.println(
                "Status     : " + status
        );

        System.out.println(
                "================================"
        );
    }
}
