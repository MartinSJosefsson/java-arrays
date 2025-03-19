package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayDemoTest {

    // scenarios to test:
    // findMaxNumber
    //1. an array with positive numbers
    //2. an array with negative numbers
    //3. an array with positive and negative numbers
    //4. an empty array
    //5. an array with duplicate numbers
    //....

    @Test
    @DisplayName("Find the maximum number in an array with positive numbers")
    public void findMaxNumberWithPositiveNumbers(){

        int[] numbers = {1, 5, 3, 9, 2};

        int expected = 9;

        int actual = ArrayDemo.findMaxNumber(numbers);

        Assertions.assertEquals(expected, actual);




    }
}
