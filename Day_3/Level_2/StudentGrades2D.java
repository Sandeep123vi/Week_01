import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // 2D array to store marks for each student in physics, chemistry, and maths
        int[][] marks = new int[numberOfStudents][3]; // [0]: Physics, [1]: Chemistry, [2]: Maths
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1));

            // Input marks for physics
            do {
                System.out.print("Enter marks in Physics: ");
                marks[i][0] = input.nextInt();
                if (marks[i][0] < 0) {
                    System.out.println("Marks must be a positive value. Please try again.");
                }
            } while (marks[i][0] < 0);

            // Input marks for chemistry
            do {
                System.out.print("Enter marks in Chemistry: ");
                marks[i][1] = input.nextInt();
                if (marks[i][1] < 0) {
                    System.out.println("Marks must be a positive value. Please try again.");
                }
            } while (marks[i][1] < 0);

            // Input marks for maths
            do {
                System.out.print("Enter marks in Maths: ");
                marks[i][2] = input.nextInt();
                if (marks[i][2] < 0) {
                    System.out.println("Marks must be a positive value. Please try again.");
                }
            } while (marks[i][2] < 0);
        }

        // Calculate percentages and grades for each student
        for (int i = 0; i < numberOfStudents; i++) {
            // Calculate total and percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (double) totalMarks / 3;

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if(percentages[i]>=50){
                grades[i] = 'D';
            }
            else if(percentages[i]>=40){
                grades[i]='E';
            }
            else {
                grades[i]='R';
            }
        }

        // Display marks, percentages, and grades of each student
        System.out.println("\n--- Student Report ---");
        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%-8d | %-7d | %-9d | %-5d | %-10.2f | %-5c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        // Close the scanner
        input.close();
    }
}
