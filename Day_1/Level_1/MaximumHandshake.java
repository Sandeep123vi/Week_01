import java.util.Scanner;

public class MaximumHandshake {
    public static void main(String [] args){
        // prompt to create Scanner object to take user input
        Scanner input = new Scanner(System.in);
         System.out.print("Enter the number of students: ");
         //prompt to take input from user of number of student
        int numberOfStudents = input.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of handshakes is " + handshakes);

    }
}
