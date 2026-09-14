# Student Management & Performance Analysis System

## 1. Project Overview

The Student Management & Performance Analysis System is a Java-based console application designed to manage student information and analyze academic performance.

The system allows users to add, search, delete, and display student records. It also provides functionality to manage marks and attendance and generate a performance report containing percentage, grade, attendance, and pass/fail status.

The project demonstrates important Java programming concepts such as classes and objects, inheritance, abstraction, encapsulation, collections, exception handling, file handling, modular programming, and input validation.

---

## 2. Problem Statement

Managing student information, marks, and attendance manually can be time-consuming and error-prone.

This project provides a simple computerized system that stores student information, manages academic marks and attendance, and automatically analyzes student performance.

---

## 3. Objectives

The main objectives of this project are:

- To manage student information efficiently.
- To store and manage student marks.
- To record and calculate attendance percentage.
- To calculate academic percentage and grade.
- To determine student pass/fail status.
- To provide input validation and error handling.
- To save student performance records in a file.
- To demonstrate object-oriented programming concepts in Java.

---

## 4. Main Features

### Student Management
- Add a new student.
- Search for a student using Student ID.
- Display all students.
- Delete a student.
- Prevent duplicate Student IDs.

### Marks Management
- Add marks for multiple subjects.
- Calculate total marks.
- Calculate average marks.
- Display subject-wise marks.

### Attendance Management
- Enter total classes.
- Enter attended classes.
- Calculate attendance percentage.

### Performance Analysis
- Calculate academic percentage.
- Assign grades.
- Calculate attendance percentage.
- Determine PASS or FAIL status.
- Generate a performance report.

### File Management
- Save student performance records to a text file.

### Input Validation
- Validate empty input.
- Validate integer input.
- Validate numbers within a specific range.
- Validate marks between 0 and 100.
- Validate attendance values.

---

## 5. Technologies Used

- Programming Language: Java
- Development Environment: Visual Studio Code
- Java Version: JDK 26
- Data Structure: ArrayList, LinkedHashMap
- File Handling: Java File I/O
- Version Control: Git and GitHub

---

## 6. Project Structure

```text
StudentPerformanceSystem
│
├── exception
│   └── InvalidStudentException.java
│
├── model
│   ├── Person.java
│   ├── Student.java
│   ├── Marks.java
│   └── Attendance.java
│
├── service
│   ├── PerformanceAnalyzer.java
│   ├── StudentManager.java
│   └── FileManager.java
│
├── util
│   └── Validation.java
│
├── Main.java
├── README.md
└── student_records.txt