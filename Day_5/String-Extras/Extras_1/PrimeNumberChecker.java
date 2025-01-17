import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of number from user
        System.out.println("Enter Number to Check: ");
        int num = input.nextInt();

        //Calling method to check if number is Prime
        boolean isPrime = isPrime(num);

        if(isPrime){
            System.out.println(num+" is Prime");
        }else {
            System.out.println(num+" is not Prime");
        }
    }
    //Method to check is number is prime
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
