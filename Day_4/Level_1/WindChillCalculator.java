import java.util.Scanner;

public class WindChillCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Taking temperature and wind speed from the user
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = scanner.nextDouble();

        // Create an object of the WindChillCalculator class to use the method
        WindChillCalculator calculator = new WindChillCalculator();
        // Calculate the wind chill temperature
        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        System.out.println("The wind chill temperature is: " + windChill + "°F");

        scanner.close();
    }
//Method to calculate the wind chill temperature using the formula:
    public double calculateWindChill(double temperature, double windSpeed) {
        // Calculate the wind chill using the given formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        
        return windChill;
    }
}
