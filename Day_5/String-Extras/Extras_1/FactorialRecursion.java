import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of number
        System.out.println("Enter a number to find factorial:");
        int num = input.nextInt();

        //Calling factorial method to find factorial
        int factorial = factorial(num);
        System.out.println("Factorial of "+num+ " is "+factorial);
    }
    //Method to find factorial using recursion
    public static int factorial(int num){
        if(num==0){
            return 1;
        }

        int fn = num * factorial(num-1);
        return fn;
    }
}
