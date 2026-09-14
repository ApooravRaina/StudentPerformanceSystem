package model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Marks {

    private Map<String, Double> subjectMarks;

    public Marks() {
        subjectMarks = new LinkedHashMap<>();
    }

    public void addMarks(String subject, double marks) {
        subjectMarks.put(subject, marks);
    }

    public Map<String, Double> getSubjectMarks() {
        return subjectMarks;
    }

    public double calculateTotal() {

        double total = 0;

        for (double mark : subjectMarks.values()) {
            total += mark;
        }

        return total;
    }

    public double calculateAverage() {

        if (subjectMarks.isEmpty()) {
            return 0;
        }

        return calculateTotal() / subjectMarks.size();
    }

    public void displayMarks() {

        System.out.println("\n----- MARKS -----");

        if (subjectMarks.isEmpty()) {
            System.out.println("No marks entered.");
            return;
        }

        for (Map.Entry<String, Double> entry : subjectMarks.entrySet()) {

            System.out.println(
                    entry.getKey() + " : " + entry.getValue()
            );
        }

        System.out.println("-----------------");

        System.out.println(
                "Total   : " + calculateTotal()
        );

        System.out.printf(
                "Average : %.2f%n",
                calculateAverage()
        );
    }
}
