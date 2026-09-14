package model;

public class Attendance {

    private int totalClasses;
    private int attendedClasses;

    public Attendance() {
        totalClasses = 0;
        attendedClasses = 0;
    }

    public void setAttendance(int totalClasses, int attendedClasses) {

        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }

    public double calculatePercentage() {

        if (totalClasses == 0) {
            return 0;
        }

        return ((double) attendedClasses / totalClasses) * 100;
    }

    public void displayAttendance() {

        System.out.println("\n----- ATTENDANCE -----");

        System.out.println(
                "Total Classes    : " + totalClasses
        );

        System.out.println(
                "Attended Classes : " + attendedClasses
        );

        System.out.printf(
                "Attendance       : %.2f%%%n",
                calculatePercentage()
        );

        System.out.println("----------------------");
    }
}