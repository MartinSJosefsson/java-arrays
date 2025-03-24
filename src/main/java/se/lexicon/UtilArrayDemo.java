package se.lexicon;

import java.util.Arrays;

import static se.lexicon.ArrayDemo.ex1;

public class UtilArrayDemo {

    public static void main(String[] args) {
        ex1();
    }

    public static void ex1() {
        String[] names = {"Simon", "erik", "Ulf", "Fredrik", "Jonas", "Kent", "Markus", "Martina"};
        System.out.println("Original Array: " + Arrays.toString(names));

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        // Arrays.sort(names, String.CASE_INSENSITIVE_ORDER.reversed()); reverse order
        System.out.println("Sorted Array: " + Arrays.toString(names));

    }

    public static void ex2() {
        int[] numbers = {700, 900, 200, 4555, 34500, 445000, 600000};
        Arrays.sort(numbers); // Array sorted from lowest to highest number
        int index = Arrays.binarySearch(numbers, 700);
        if (index < 0) {
            System.out.println("Index not found.");
        } else {
            System.out.println("Value found [" + index + "]: " + numbers[index]);
        }
    }

    public static void ex3() {
        int[] numbers = {10, 20, 30, 40};
        int[] newArray = Arrays.copyOf(numbers, numbers.length +1);
        newArray[newArray.length -1] = 100;



    }

}
