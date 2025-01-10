import java.util.Scanner;

public class TotalIncome {
    public static void main(String [] args){
        //Promt to create Scanner object to take a user input
        Scanner input= new Scanner(System.in);
         System.out.print("Enter salary: ");
         //Promt to take a salary from user
        double salary = input.nextDouble();
        System.out.print("Enter bonus: ");
        double bonus = input.nextDouble();
        //prompt to take bonus from user
        double totalIncome = salary + bonus;
        //prompt to print value of salary, bonus and totalincome
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);

    }
}
