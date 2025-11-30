package algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};
        insertionSort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        String[] words = {"Banana", "Peanut", "Apple", "Orange", "Coconut"};

        System.out.println();
        System.out.println("--------------");
        insertionStringSort(words);
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println();
        System.out.println("--------------");
        insertionStringLengthSort(words);
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println();
        System.out.println("--------------");
        System.out.println(insertionShiftCounter(words));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void insertionStringSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void insertionStringLengthSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 &&
                    (key.length() < arr[j].length() ||
                            (key.length() == arr[j].length() && key.compareTo(arr[j]) < 0))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static int insertionShiftCounter(String[] arr) {
        int shiftCounter = 0;
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
                shiftCounter++;
            }
            arr[j + 1] = key;
        }
        return shiftCounter;
    }
}
