package leetcode;

import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(RomanToInt("III"));
        System.out.println(RomanToInt("LVIII"));
        System.out.println(RomanToInt("MCMXCIV"));
    }
    public static int RomanToInt (String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < s.length(); i++) {
            int currentValue = romanValues.get(s.charAt(i));
            if (i < n - 1 && currentValue < romanValues.get(s.charAt(i + 1))) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }
        return result;
    }
}
