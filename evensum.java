package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersGenerator {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        int num;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please provide an integer.");
            return;
        }

        if (num <= 0) {
            System.out.println("Please provide a positive number.");
            return;
        }

        List<Integer> evenNumbers = new ArrayList<>();
        int sum = 0;

        for (int i = 2; i <= num; i += 2) {
            evenNumbers.add(i);
            sum += i;
        }

        String outputNumbers = evenNumbers.stream()
                                         .map(String::valueOf)
                                         .collect(Collectors.joining(","));

        System.out.println(outputNumbers);
        System.out.println(sum);
    }
}
