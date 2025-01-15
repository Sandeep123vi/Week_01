import java.util.Scanner;

public class TemperatureConversionFahrenheitToCelsius {
     public static void main(String [] args){
      // promt to creat a Scanner object to take a user input 
     Scanner input = new Scanner(System.in);
    System.out.print("Enter temperature in Fahrenheit: ");
    double   fahrenheit = input.nextDouble();
    double  celsius = (fahrenheit - 32) * 5 / 9;
    // prompt for printing conversion from 
    //farenheit to celsius
    System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");

     }
}
