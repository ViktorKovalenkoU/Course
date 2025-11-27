package algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};
        selectionSort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        String[] words = {"Banana", "Peanut", "Apple", "Orange", "Coconut"};
        System.out.println();
        System.out.println("--------------");
        selectionStringSort(words);
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println();
        System.out.println("--------------");
        selectionStringLengthSort(words);
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println();
        System.out.println("--------------");
        System.out.println(selectionSortSwapCounter(words));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selectionStringSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selectionStringLengthSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minLengthIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].length() < arr[minLengthIndex].length()) {
                    minLengthIndex = j;
                }
            }
            String temp = arr[minLengthIndex];
            arr[minLengthIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static int selectionSortSwapCounter(String[] arr) {
        int swapCounter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex].compareTo(arr[j]) > 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                swapCounter++;
            }
        }
        return swapCounter;
    }
}