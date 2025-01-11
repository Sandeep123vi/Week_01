import java.util.HashSet;

public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Math.random() generates a number between 0 and 1, we multiply by 1000000 to get a number between 0 and 999999
        int otp = (int) (Math.random() * 1000000);

        // Ensure the OTP is a 6-digit number by checking if it's less than 100000
        // If it's less, add leading zeros (or generate a new OTP)
        if (otp < 100000) {
            otp += 100000; // Make sure the number has 6 digits
        }
        return otp;
    }

    // Method to check if all OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        // Using HashSet to automatically handle uniqueness
        HashSet<Integer> otpSet = new HashSet<>();

        // Loop through the OTP array and add each OTP to the set
        for (int otp : otps) {
            otpSet.add(otp);
        }

        // If the size of the set equals the length of the array, it means all OTPs are unique
        return otpSet.size() == otps.length;
    }

    public static void main(String[] args) {
        int[] otps = new int[10]; // Array to store 10 OTP numbers

        // Generate 10 OTP numbers and store them in the array
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display the OTP numbers generated
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check if all OTP numbers are unique
        boolean unique = areOTPsUnique(otps);

        // Display the result
        if (unique) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicated.");
        }
    }
}
