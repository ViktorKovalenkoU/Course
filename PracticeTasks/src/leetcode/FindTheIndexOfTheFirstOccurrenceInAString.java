package leetcode;

import java.util.Arrays;
import java.util.Iterator;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {

        String haystack = "leetcode";
        String needle = "leeto";

        int wordStartIndex = strStr(haystack, needle);
        System.out.println(wordStartIndex);
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
