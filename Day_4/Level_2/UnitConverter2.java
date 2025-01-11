public class UnitConverter2 {

    // Conversion constants for various units
    private static final double FAHRENHEIT_TO_CELSIUS = 5.0 / 9.0;
    private static final double CELSIUS_TO_FAHRENHEIT = 9.0 / 5.0;
    private static final double POUNDS_TO_KILOGRAMS = 0.453592;
    private static final double KILOGRAMS_TO_POUNDS = 2.20462;
    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;

    
     // Method to convert Fahrenheit to Celsius.
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * FAHRENHEIT_TO_CELSIUS;
    }

     // Method to convert Celsius to Fahrenheit.
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * CELSIUS_TO_FAHRENHEIT) + 32;
    }

     // Method to convert pounds to kilograms.
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

     // Method to convert kilograms to pounds.
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }

     // Method to convert gallons to liters.
    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

     // Method to convert liters to gallons.
    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }

    public static void main(String[] args) {
        // Example usage of the UnitConverter class

        double fahrenheit = 100.0;
        double celsius = 37.0;
        double pounds = 150.0;
        double kilograms = 68.0;
        double gallons = 5.0;
        double liters = 18.9;

        System.out.println(fahrenheit + "°F is equal to " + convertFahrenheitToCelsius(fahrenheit) + "°C.");
        System.out.println(celsius + "°C is equal to " + convertCelsiusToFahrenheit(celsius) + "°F.");
        System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");
        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");
    }
}
