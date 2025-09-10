package com.example;

public class PrimeSum {

    public static void main(String[] args) {
        int maxNum = 10; // Example value
        long sum = calculatePrimeSum(maxNum);
        System.out.println("The sum of prime numbers up to " + maxNum + " is: " + sum);
    }

    public static long calculatePrimeSum(int maxNum) {
        if (maxNum <= 0) {
            System.out.println("The sum of prime numbers for maxNum <= 0 is: 0");
            return 0;
        }

        long sum = 0;
        for (int i = 2; i <= maxNum; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
