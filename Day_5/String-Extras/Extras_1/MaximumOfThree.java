import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking input of three numbers from user
        System.out.println("Enter 1st Number:");
        int firstNum = input.nextInt();
        System.out.println("Enter 2nd Number:");
        int secondNum = input.nextInt();
        System.out.println("Enter 3rd Number:");
        int thirdNum = input.nextInt();

        //Calling method to find maximum number
        int findMaximum = maximumNumber(firstNum,secondNum,thirdNum);
        System.out.println(findMaximum);

    }
    public static int maximumNumber(int firstNum, int secondNum, int thirdNum){
        if(firstNum > secondNum && firstNum > thirdNum){
            return (firstNum);
        }else if(secondNum > thirdNum){
            return (secondNum);
        }else{
            return (thirdNum);
        }
    }
}
