package temp;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String str = "God bless America";
        char chr = 'G';
        int number = 5;
        double price = 123.456789;
        long longNumber = 1452342542342l;
        double sum = 0;

        System.out.printf("Price %.2fUAH\n", price);
        System.out.printf("Number of employees: %d \n", number);
        System.out.printf("Best spot is %c\n", chr);
        System.out.printf("Long %d and double %f\n", longNumber, price);


        System.out.printf("|%-10s|%10s|%10s|%n", "Имя", "Возраст", "Баллы");
        System.out.printf("|%-10s|%10d|%10.2f|%n", "Viktor", 25, 95.5);
        System.out.printf("|%-10s|%10d|%10.2f|%n", "Alex", 26, 100.05);

        System.out.printf("Long number: %,d%n", longNumber);

        int[] randomArray = getRandomArray(10);
        System.out.println("Array: " + Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println("Sorted array: " + Arrays.toString(randomArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallArray));

        int[] largeArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largeArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5, 0};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;


    }

}
