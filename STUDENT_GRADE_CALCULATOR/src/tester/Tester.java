package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.calculator.GradeCalculator;

public class Tester {
    public static void main(String[] args) {
        List<Integer> marksList = new ArrayList<>();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Choose an option:");
                System.out.println("1. Enter marks for a subject");
                System.out.println("2. Calculate total marks and average percentage");
                System.out.println("3. Calculate grade");
                System.out.println("4. Exit");

                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Enter marks obtained in the subject: ");
                        int marks = scanner.nextInt();
                        if(marks <= 100) {
                        	marksList.add(marks);
                        }else {
                        	System.out.println("Number should be less then or equel to  100");
                        }
                        
                        break;
                    case 2:
                        int totalMarks = GradeCalculator.calculateTotalMarks(marksList);
                        double averagePercentage = GradeCalculator.calculateAveragePercentage(totalMarks, marksList.size());
                        System.out.println("Total Marks: " + totalMarks);
                        System.out.println("Average Percentage: " + averagePercentage + "%");
                        break;
                    case 3:
                        double avgPercentage = GradeCalculator.calculateAveragePercentage(GradeCalculator.calculateTotalMarks(marksList), marksList.size());
                        char grade = GradeCalculator.calculateGrade(avgPercentage);
                        System.out.println("Grade: " + grade);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            }
        }catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
