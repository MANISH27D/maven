package com.example;

public class EvenSum {

    public static void main(String[] args) {
        // Pre-defined variable num
        int num = 10; // Change this value to test different scenarios

        StringBuilder evenNumbers = new StringBuilder();
        int sum = 0;

        for (int i = 2; i <= num; i += 2) {
            evenNumbers.append(i);
            sum += i;
            if (i < num && (i + 2) <= num) { // Add comma only if there are more even numbers to follow
                evenNumbers.append(",");
            }
        }

        System.out.println(evenNumbers.toString());
        System.out.println(sum);
    }
}
