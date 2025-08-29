package temp.tempAI;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayPractice {
    public static void main(String[] args) {
        System.out.println("Array numbers sum = " +
                arraySumChecker(new int[]{1, 2, 6, 2, 4}));

        System.out.println("Min and Max value of array = " +
                Arrays.toString(minMaxArrayNumbers(new int[]{1,2,3,2,1})));

        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println("In-place reversed array = " + Arrays.toString(arr));

        System.out.println("New reversed array = " + Arrays.toString(reverseNew(arr)));

        int[] findEven = new int[]{1, 2, 4, 7};
        System.out.println("Even elements count = " + evenCount(findEven));

        int[] a = {1,3,5}; int[] b = {2,4,6};
        System.out.println("Merged and sorted arrays to array = " +
                Arrays.toString(mergerSorted(a, b)));
    }

    public static int[] mergerSorted(int[] a, int[] b) {
//        int[] combined = new int[a.length + b.length];
//        System.arraycopy(a, 0, combined, 0, a.length);
//        System.arraycopy(b, 0, combined, a.length, b.length);
        int[] combined = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                        .toArray();
        Arrays.sort(combined);
        return combined;
    }

    public static int evenCount(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseNew(int[] numbers) {
        int[] newArr = new int[numbers.length];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            newArr[k] = numbers[i];
            k++;
        }
        return newArr;
    }

    public static void reverse(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }

    public static int[] minMaxArrayNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Numbers array cant be empty!");
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return new int[]{min, max};
    }


    public static int arraySumChecker(int[] numbers) {
        int sum = 0;
        if (numbers != null) {
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            return sum;
        }
        return 0;
    }
}
