package se.lexicon;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        String[] names = new String[3];
        char[] letters = {1, 2, 3, 4, 5};


        ex2();

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
            System.out.println(number);
        }




    }
}
