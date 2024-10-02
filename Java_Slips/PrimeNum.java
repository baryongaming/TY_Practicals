import java.util.Scanner;

public class PrimeNum {
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Handle special cases
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (n <= 3) {
            return true; // 2 and 3 are prime numbers
        }
        // Eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        // Check for factors from 5 to √n
        for (int i = 5; i * i <= n; i += 1) {
            if (n % i == 0) {
                return false; // If divisible, not prime
            }
        }
        return true; // If no factors found, n is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of elements?");
        int n = sc.nextInt();
        int[] numberArr = new int[n]; // Create an array of size n

        // Input elements into the array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + "th number:");
            numberArr[i] = sc.nextInt();
        }

        System.out.println("Prime numbers are:");
        // Check each number in the array
        for (int i = 0; i < n; i++) {
            if (isPrime(numberArr[i])) {
                System.out.println(numberArr[i]); // Print the prime number
            }

        }
    }
}
