# Project Statement

## Project Title

Student Management & Performance Analysis System

---

## Problem Statement

Keeping student details, marks and attendance separately can make it difficult to check a student's overall performance.

For this project, I wanted to create a simple Java application where student information, marks and attendance can be managed from one system. The application also calculates the student's average marks, grade, attendance percentage and final performance status.

---

## Scope of the Project

The project is designed as a console-based Java application.

The current version focuses on:

- Managing student details
- Adding and searching students
- Deleting student records
- Adding marks for different subjects
- Calculating average marks
- Recording attendance
- Calculating attendance percentage
- Analyzing student performance
- Saving student records in a text file
- Handling invalid inputs

The current project does not use a database or graphical user interface.

---

## Target Users

The main users of this system can be:

- Teachers
- Faculty members
- Academic staff
- Students for checking their performance

The current version is mainly designed as a small academic project to demonstrate how Java can be used to solve a practical problem.

---

## High-Level Features

### 1. Student Management

The system allows the user to add, search, display and delete student records.

Each student has information such as:

- Student ID
- Name
- Age
- Course
- Semester

### 2. Marks Management

The user can enter marks for multiple subjects.

The system calculates:

- Total marks
- Average marks
- Subject-wise marks

### 3. Attendance Management

The user can enter the total number of classes and attended classes.

The system automatically calculates the attendance percentage.

### 4. Performance Analysis

The system uses the marks and attendance information to generate a performance report.

The report contains:

- Percentage
- Grade
- Attendance percentage
- PASS/FAIL status

### 5. File Management

The user can save a student's performance information into a text file.

### 6. Input Validation

The system checks user input and prevents invalid values such as marks outside the 0–100 range or empty student information.

---

## Basic Workflow

```text
Start
  ↓
Main Menu
  ↓
Add Student
  ↓
Enter Marks
  ↓
Enter Attendance
  ↓
Performance Analysis
  ↓
Display Result
  ↓
Save Record
  ↓
Exit