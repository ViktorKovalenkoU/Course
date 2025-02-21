package array.practice1;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] myArray = getRandomArray(5);
        System.out.println(Arrays.toString(myArray));

        int[] sortedArray = sortIntegers(new int[]{7,30,35});
        System.out.println(Arrays.toString(sortedArray));

        int[] mySortedArray1 = sortIntegers(myArray);
        System.out.println(Arrays.toString(mySortedArray1));

    }

    private static int[] sortIntegers(int[] array) {

        System.out.println(Arrays.toString(array));
        int[] mySortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < mySortedArray.length - 1; i++) {
                if (mySortedArray[i] < mySortedArray[i + 1]) {
                    temp = mySortedArray[i];
                    mySortedArray[i] = mySortedArray[i + 1];
                    mySortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return mySortedArray;
    }

        private static int[] getRandomArray (int len){
            Random random = new Random();
            int[] array = new int[len];
            for (int i = 0; i < len; i++) {
                array[i] = random.nextInt(50);
            }
            return array;
        }
    }

