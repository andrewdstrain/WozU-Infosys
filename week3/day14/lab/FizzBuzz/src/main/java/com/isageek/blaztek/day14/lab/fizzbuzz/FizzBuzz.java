package com.isageek.blaztek.day14.lab.fizzbuzz;

public class FizzBuzz {
    public static String doFizzBuzz() {
        String[] array = new String[100];

        for (int i = 0; i < 100; i++) {
            int num = i + 1;
            String number = "";

            number += num % 3 == 0 ? "Fizz" : "";
            number += num % 5 == 0 ? "Buzz" : "";
            number += number.isEmpty() ? Integer.toString(num) : "";

            array[i] = number;
        }

        return String.join(",", array);
    }
}
