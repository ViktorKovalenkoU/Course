package algorithms;

public class CountingSort {
    public static void main(String[] args) {
        String[] words = {"Peanut", "Apple", "Banana", "Orange", "Tamarillo", "Coconut"};
        countingSort(words);

        System.out.println("\n-------------------");

        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    public static void countingSort(String[] arr) {
        int n = arr.length;

        int min = arr[0].length(), max = arr[0].length();
        for (int i = 1; i < n; i++) {
            int len = arr[i].length();
            if (len < min) min = len;
            if (len > max) max = len;
        }

        int range = max - min + 1;
        int[] count = new int[range];

        for (String s : arr) {
            count[s.length() - min]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        String[] output = new String[n];

        for (int i = n - 1; i >= 0; i--) {
            String s = arr[i];
            int pos = count[s.length() - min] - 1;
            output[pos] = s;
            count[s.length() - min]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }
}
