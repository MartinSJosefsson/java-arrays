package se.lexicon;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {


        int[] numbers = new int[3];
        String[] names = new String[3];
        char[] letters = {1, 2, 3, 4, 5};


        ex1();

    }

    public static void ex1() {
        String[] names = new String[3];
        System.out.println(names.length);
        System.out.println("---------------------");
        names[0] = "Fredrik";
        names[1] = "Markus";
        names[names.length - 1] = "Jonas";

        System.out.println(names[1]);
        System.out.println(names[0]);
        System.out.println(names[2]);
    }

    public static void ex2() {
        int[] numbers = {5, 2, 3, 4, 7};
        for (int i = 0; i < numbers.length; i++) {
            if (i == 2){
                numbers[i] = 200;
            }
            if(numbers[i] % 2 == 0){
            System.out.println("index [" + i + "] = " + numbers[i]);
        }}
        System.out.println("----------------------------");
        for ( int number : numbers){
            if(number == 200){
                number = 5000;
            }
            System.out.println(number);
        }

        System.out.println("--------------------------");
        System.out.println(Arrays.toString(numbers));

    }

    public static void ex3(){
        int[] originalArray = {2, 5, 8, 1, 9};
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(originalArray));

        int[] newArray = new int[originalArray.length +1];
        for (int i = 0 ; i< originalArray.length ; i++ ){
            newArray[i] = originalArray[i];
        }
        newArray[newArray.length -1] = 100;

        System.out.println("Expanded Array: ");
        System.out.println(Arrays.toString(newArray));

    }

    public static int findMaxNumber(int[] numbers){
        if (numbers.length == 0){
            throw new IllegalArgumentException("Array should not be empty");
        }

        int maxNumber = numbers[0];
        for(int i = 1 ; i < numbers.length ; i++){
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }

        }
        return maxNumber;



    }
}
