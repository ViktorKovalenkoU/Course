package leetcode;

import java.util.ArrayList;
import java.util.Iterator;

public class MinimumRecolorsToGetK {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimumRecolors(blocks, k));
    }

    public static int minimumRecolors(String blocks, int k) {
        int minOperations = Integer.MAX_VALUE;
        int currentWhiteCount = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                currentWhiteCount++;
            }
        }
        minOperations = currentWhiteCount;
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                currentWhiteCount--;
            }
            if (blocks.charAt(i) == 'W') {
                currentWhiteCount++;
            }
            minOperations = Math.min(minOperations, currentWhiteCount);
        }
        return minOperations;
    }
}



