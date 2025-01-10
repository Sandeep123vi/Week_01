import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables to store marks for each subject
        double physics, chemistry, maths;

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        physics = scanner.nextDouble();
        
        System.out.print("Enter marks for Chemistry: ");
        chemistry = scanner.nextDouble();
        
        System.out.print("Enter marks for Maths: ");
        maths = scanner.nextDouble();
        
        // Calculate total marks and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;
        
        // Display the average percentage
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");

        // Determine the grade and remarks based on percentage
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4,above agency-normalized standard";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standard";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2,below, but approaching agency-normalized standard";
        } 
        else if(percentage>=50){
            grade="D";
            remarks="Level 1, well below agency-normalized standard";
        }
        else if(percentage>=40){
            grade="E";
            remarks="Level 1, too below agency-normalized standard";
        }
        else {
            grade = "R";
            remarks = "Remidials standard";
        }

        // Display grade and remarks
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close the scanner
        scanner.close();
    }
}
