import java.util.*;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of two numbers
        System.out.println("Enter 1st number:");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = input.nextInt();

        int lcm = findLCM(num1,num2);
        System.out.println("LCM is "+lcm);

        int gcd = findGCD(num1,num2);
        System.out.println("GCD is "+gcd);

    }
    //Method to find GCM
    public static int findGCD(int num1, int num2) {
        while(num1 % num2 != 0){
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        return num2;
    }

    //Method to find LCM
    public static int findLCM(int num1, int num2){
        int lcm = num1 * num2 / findGCD(num1,num2);
        if (lcm < 0){
            return -1 * lcm;
        }
        return lcm;
    }
}
