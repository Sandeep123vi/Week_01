import java.util.*;

public class FibonacciSeries {
    //Function to print N Fibonacci Number
    public static void Fibonacci(int number) {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < number; i++) {
            //Print the number
            System.out.print(num1 + " ");

            //Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        //Taking input of number from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

        //Calling fibonacci method
        Fibonacci(number);
    }
}
