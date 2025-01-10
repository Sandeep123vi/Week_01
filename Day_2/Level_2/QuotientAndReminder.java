import java.util.Scanner;

class QuotientAndReminder{
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input for first number 
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();
        // User input for second number 
        System.out.print("Enter second number: ");
        int number2 = input.nextInt();
        int quotient = number1 / number2;// finding quotient by dividing number1 to number2 
        int reminder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two numbers " + number1 + " and " + number2);




 }
}