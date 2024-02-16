package com.app.calculator;

import java.util.List;

public class GradeCalculator {
	
    public static int calculateTotalMarks(List<Integer> marksList) {
        int totalMarks = 0;
        for (int marks : marksList) {
            totalMarks += marks;
        }
        return totalMarks;
    }
    
    public static double calculateAveragePercentage(int totalMarks, int numSubjects) {
        return (double) totalMarks / numSubjects;
    }
    
    public static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

