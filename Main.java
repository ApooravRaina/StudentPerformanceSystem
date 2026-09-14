import exception.InvalidStudentException;
import model.Student;
import service.FileManager;
import service.PerformanceAnalyzer;
import service.StudentManager;
import util.Validation;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static StudentManager studentManager =
            new StudentManager();

    private static PerformanceAnalyzer analyzer =
            new PerformanceAnalyzer();

    private static FileManager fileManager =
            new FileManager();

    public static void main(String[] args) {

        System.out.println(
                "=========================================="
        );

        System.out.println(
                " STUDENT MANAGEMENT & PERFORMANCE SYSTEM"
        );

        System.out.println(
                "=========================================="
        );

        runApplication();

        scanner.close();
    }

    private static void runApplication() {

        while (true) {

            displayMenu();

            int choice =
                    Validation.getIntInRange(
                            scanner,
                            "Enter your choice: ",
                            1,
                            8
                    );

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    searchStudent();
                    break;

                case 3:
                    enterMarks();
                    break;

                case 4:
                    enterAttendance();
                    break;

                case 5:
                    showPerformance();
                    break;

                case 6:
                    displayStudents();
                    break;

                case 7:
                    deleteStudent();
                    break;

                case 8:

                    System.out.println(
                            "\nThank you for using the system."
                    );

                    return;
            }
        }
    }

    private static void displayMenu() {

        System.out.println("\n");
        System.out.println("============== MAIN MENU ==============");

        System.out.println("1. Add Student");
        System.out.println("2. Search Student");
        System.out.println("3. Enter Marks");
        System.out.println("4. Enter Attendance");
        System.out.println("5. Performance Analysis");
        System.out.println("6. Display All Students");
        System.out.println("7. Delete Student");
        System.out.println("8. Exit");

        System.out.println("========================================");
    }

    private static void addStudent() {

        System.out.println("\n----- ADD STUDENT -----");

        String id =
                Validation.getNonEmptyString(
                        scanner,
                        "Enter Student ID: "
                );

        String name =
                Validation.getNonEmptyString(
                        scanner,
                        "Enter Name: "
                );

        int age =
                Validation.getIntInRange(
                        scanner,
                        "Enter Age: ",
                        15,
                        100
                );

        String course =
                Validation.getNonEmptyString(
                        scanner,
                        "Enter Course: "
                );

        int semester =
                Validation.getIntInRange(
                        scanner,
                        "Enter Semester: ",
                        1,
                        8
                );

        Student student =
                new Student(
                        id,
                        name,
                        age,
                        course,
                        semester
                );

        try {

            studentManager.addStudent(student);

        } catch (InvalidStudentException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }

    private static Student getStudentFromUser() {

        String id =
                Validation.getNonEmptyString(
                        scanner,
                        "Enter Student ID: "
                );

        Student student =
                studentManager.findStudent(id);

        if (student == null) {

            System.out.println(
                    "Student not found."
            );
        }

        return student;
    }

    private static void searchStudent() {

        System.out.println("\n----- SEARCH STUDENT -----");

        Student student =
                getStudentFromUser();

        if (student != null) {

            student.displayDetails();

            student.getMarks().displayMarks();

            student.getAttendance()
                    .displayAttendance();
        }
    }

    private static void enterMarks() {

        System.out.println("\n----- ENTER MARKS -----");

        Student student =
                getStudentFromUser();

        if (student == null) {
            return;
        }

        int numberOfSubjects =
                Validation.getIntInRange(
                        scanner,
                        "Number of subjects: ",
                        1,
                        20
                );

        for (int i = 1;
             i <= numberOfSubjects;
             i++) {

            String subject =
                    Validation.getNonEmptyString(
                            scanner,
                            "Enter subject " + i + ": "
                    );

            double marks =
                    Validation.getDoubleInRange(
                            scanner,
                            "Enter marks for "
                                    + subject + ": ",
                            0,
                            100
                    );

            student.getMarks()
                    .addMarks(subject, marks);
        }

        System.out.println(
                "Marks added successfully."
        );
    }

    private static void enterAttendance() {

        System.out.println(
                "\n----- ENTER ATTENDANCE -----"
        );

        Student student =
                getStudentFromUser();

        if (student == null) {
            return;
        }

        int totalClasses =
                Validation.getPositiveInt(
                        scanner,
                        "Enter total classes: "
                );

        int attendedClasses =
                Validation.getIntInRange(
                        scanner,
                        "Enter attended classes: ",
                        0,
                        totalClasses
                );

        student.getAttendance()
                .setAttendance(
                        totalClasses,
                        attendedClasses
                );

        System.out.println(
                "Attendance updated successfully."
        );
    }

    private static void showPerformance() {

        System.out.println(
                "\n----- PERFORMANCE ANALYSIS -----"
        );

        Student student =
                getStudentFromUser();

        if (student == null) {
            return;
        }

        if (student.getMarks()
                .getSubjectMarks()
                .isEmpty()) {

            System.out.println(
                    "Please enter marks first."
            );

            return;
        }

        analyzer.displayPerformance(student);

        System.out.print(
                "\nDo you want to save this record? (Y/N): "
        );

        String answer =
                scanner.nextLine();

        if (answer.equalsIgnoreCase("Y")) {

            fileManager.saveStudent(student);
        }
    }

    private static void displayStudents() {

        studentManager.displayAllStudents();
    }

    private static void deleteStudent() {

        System.out.println(
                "\n----- DELETE STUDENT -----"
        );

        String id =
                Validation.getNonEmptyString(
                        scanner,
                        "Enter Student ID: "
                );

        boolean deleted =
                studentManager.deleteStudent(id);

        if (deleted) {

            System.out.println(
                    "Student deleted successfully."
            );

        } else {

            System.out.println(
                    "Student not found."
            );
        }
    }
}