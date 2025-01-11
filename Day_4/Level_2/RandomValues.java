import java.util.Arrays;

public class RandomValues {

    // Method to generate an array of 4-digit random numbers of given size
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        
        // Loop to generate 4-digit random numbers
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;  // Generates a number between 1000 and 9999
        }
        return randomNumbers;
    }

    // Method to calculate the average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Loop to calculate the sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);  // Find the minimum value
            max = Math.max(max, num);  // Find the maximum value
        }

        double average = sum / numbers.length;  // Calculate the average
        
        return new double[] {average, min, max};
    }

    public static void main(String[] args) {
        // Generate an array of 5 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        // Display the generated random numbers
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));

        // Calculate average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Average Value: " + results[0]);
        System.out.println("Minimum Value: " + results[1]);
        System.out.println("Maximum Value: " + results[2]);
    }
}
