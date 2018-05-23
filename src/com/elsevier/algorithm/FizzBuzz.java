package com.elsevier.algorithm;

import java.util.stream.IntStream;

/**
 * @Author Arani
 */
public class FizzBuzz {

    public static void main(String[] args) {

        printFizzbuzzWithLoops();
        printFizzbBuzzWithoutLoops();

    }

    /**
     * Prints FizzBuzz using for loops and if-else statements
     */
    private static void printFizzbuzzWithLoops() {
        for (int i = 1; i <= 100; i++) {
            String result = "";
            if (i % 3 == 0) {
                result = "Fizz";
            }
            if (i % 5 == 0) {
                result = result.concat("Buzz");
            }
            if ("".equalsIgnoreCase(result)) {
                result = String.valueOf(i);
            }
            System.out.println(result);
        }
    }

    /**
     * Prints Fizzbuzz Algo without forloops.
     * Based on functional programming
     */
    private static void printFizzbBuzzWithoutLoops() {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 3 == 0 ? (i % 15 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
