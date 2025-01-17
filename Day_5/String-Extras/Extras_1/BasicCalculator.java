import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of two numbers
        System.out.println("Enter 1st number:");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = input.nextInt();

        System.out.println("Enter Operation (+,-,*,/)");
        char ch = input.next().charAt(0);

        switch (ch){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }
    }
}
