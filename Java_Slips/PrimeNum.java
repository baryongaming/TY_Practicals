// Write a Program to print all Prime numbers in an array of ‘n’ elements.

import java.util.Scanner;

public class PrimeNumbersInArray {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input the elements of the array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print prime numbers
        System.out.println("Prime numbers are:");
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
