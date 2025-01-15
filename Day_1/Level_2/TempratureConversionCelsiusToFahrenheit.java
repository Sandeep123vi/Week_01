import java.util.Scanner;

public class TempratureConversionCelsiusToFahrenheit {
    public static void main(String [] args){
        // create a  Scanner object to take user input 
        Scanner input= new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        // Prompt for final conversion from celsius to fahrenheit
        System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit");

    }
}
