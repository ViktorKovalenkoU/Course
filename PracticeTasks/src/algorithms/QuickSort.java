package algorithms;

public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5};
        quickSort(numbers, 0, numbers.length - 1);
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n-------------");

        String[] words = {"Peanut", "Apple", "Banana", "Orange"};
        quickStringSort(words, 0, words.length - 1);
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println("\n-------------");

    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private static int stringPartition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void quickStringSort(String[] arr, int low, int high) {
        if (low < high) {
            int pi = stringPartition(arr, low, high);

            quickStringSort(arr, low, pi - 1);
            quickStringSort(arr, low + 1, high);
        }
    }
}
