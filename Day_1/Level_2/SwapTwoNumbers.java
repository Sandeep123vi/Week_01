import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String [] args){
        //prompt to Scanner object to take user input
        Scanner input= new Scanner(System.in);
        System.out.print("Enter number1: ");
        //promt to take num1 from user
        int num1 = input.nextInt();
        System.out.print("Enter number2: ");
        //promt to take num2 from user
        int num2 = input.nextInt();
        //Swapping
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The swapped numbers are " + num1 + " and " + num2);

    }
}
