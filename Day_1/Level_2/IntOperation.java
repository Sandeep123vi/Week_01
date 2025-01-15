import java.util.Scanner;

public class IntOperation {
     public static void main(String [] args){
        Scanner input= new Scanner(System.in);
         // prompts for taking input of a
        System.out.print("Enter value for a: ");
        int a = input.nextInt();
        // prompts for taking input of b
        System.out.print("Enter value for b: ");
        int b = input.nextInt();
        // prompts for taking input of c
        System.out.print("Enter value for c: ");
        int c = input.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        // Promt for the final results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

}
}
