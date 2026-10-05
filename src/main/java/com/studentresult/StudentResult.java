package com.studentresult;

public class StudentResult {

    private String studentName;
    private int mark1;
    private int mark2;
    private int mark3;

    public StudentResult(String studentName, int mark1, int mark2, int mark3) {
        this.studentName = studentName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    public String calculateGrade() {
        double average = calculateAverage();

        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public String getStudentName() {
        return studentName;
    }
}
