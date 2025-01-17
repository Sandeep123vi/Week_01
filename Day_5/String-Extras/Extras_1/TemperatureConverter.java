import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Taking input of temperature to convert
        System.out.println("Enter Temperature to convert:");
        float temp = input.nextFloat();

        //Temperature in fahrenheit
        float fahrenheit = celsiusToFahrenheit(temp);

        //Temperature in Celsius
        float celsius = fahrenheitToCelsius(temp);

        System.out.println(fahrenheit);
        System.out.println(celsius);
    }
    //Method to get temperature in fahrenheit
    public static float celsiusToFahrenheit(float temp){
        return temp * (9/5) + 32;
    }
    //Method to get temperature in celsius
    public static float fahrenheitToCelsius(float temp){
        return (temp - 32) * 5/9;
    }
}
