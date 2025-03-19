package se.lexicon;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {2, 0, 5, 6, -1, 5};
        //int[] numbers = new int[0];

        int result = ArrayDemo.findMaxNumber(numbers);
        System.out.println("Max Number is : " + result);
    }

    // scenarios to test:
    //1. an array with positive numbers
    //2. an array with negative numbers
    //3. an array with positive and negative numbers
    //4. an empty array
    //5. an array with duplicate numbers
    //....


}