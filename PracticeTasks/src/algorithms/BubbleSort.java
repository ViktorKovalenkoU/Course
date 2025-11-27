package algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        String[] words = {"Banana", "Peanut", "Apple", "Orange", "Coconut"};
        bubbleSort(words);
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("------------------");
        lengthSort(words);
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("------------------");
        reversBubbleSort(words);
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("------------------");
        System.out.println(sortChecker(words));
    }

    public static void bubbleSort(String[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void lengthSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].length() > arr[i + 1].length()) {
                String temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    public static void reversBubbleSort(String[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static <T extends Comparable<T>> boolean sortChecker(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i].compareTo(arr[i + 1]) > 0)) {
                return false;
            }
        }
        return true;
    }
}
