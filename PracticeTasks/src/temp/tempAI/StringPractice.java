import java.util.*;
import java.util.stream.Collectors;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println("Reversed by StringBuilder: " + reverseStringBuilder(str));
        System.out.println("Reversed by for-loop: " + reverseStringFor(str));

        String str2 = "A man, a plan, a canal: Panama";
        System.out.println("Boolean - String is a palindrome? - " + isPalindrome(str2));

        System.out.println("Vowels and Consonants count from a String: " + Arrays.toString(countVowelsConsonants(str2)));

        System.out.println("Count words in a String = " + countWords(str2));

        System.out.println("Index of first unique char from the String = " + uniqueChar(str2));
    }

    public static int uniqueChar(String str2) {
        char[] stringToChar = str2.toLowerCase().toCharArray();

        for (int i = 0; i < stringToChar.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < stringToChar.length; j++) {
                if (i != j && stringToChar[i] == stringToChar[j]){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return -1;
    }

    public static int countWords(String str2) {
        char[] charString = str2.toCharArray();
        int count = 0;
        boolean inWord = false;
        for (char c : charString) {
            if (Character.isLetterOrDigit(c)) {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return count;
        /*List<String> stringList = List.of(str2);
        stringList.stream()
                .filter(s -> s.getChars(str2.indexOf(0), str2.indexOf(str2.length(), ))
                .count()*/
    }

    public static int[] countVowelsConsonants(String str2) {
        Set<Character> vowels = Set.of('a', 'e', 'u', 'i', 'y', 'o');
        Set<Character> consonants = Set.of('b', 'c', 'd', 'f', 'g', 'h', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z');
        int countVowels = 0;
        int countConsonants = 0;
        for (char c : str2.toLowerCase().toCharArray()) {
            if (vowels.contains(c)) {
                countVowels++;
            }
            if (consonants.contains(c)) {
                countConsonants++;

            }
        }
        /*
        char[] charArray = str2.toLowerCase().toCharArray();
        char[] vowels = {'a', 'e', 'u', 'i', 'y', 'o'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'z'};
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (charArray[i] == vowels[j]) {
                    countVowels++;
                }
            }
            for (int k = 0; k < consonants.length; k++) {
                if (charArray[i] == consonants[k]) {
                    countConsonants++;
                }*/
        return new int[]{countVowels, countConsonants};
    }

    public static String reverseStringBuilder(String str) {
        String result = new StringBuilder(str).reverse().toString();
        return result;
    }

    public static boolean isPalindrome(String str2) {
        String refactorStr = str2.replace(",", "").replace(":", "").replace(" ", "").toLowerCase();
        String reverse = reverseStringFor(refactorStr);
        if (refactorStr.equals(reverse)) {
            return true;
        }
        return false;
    }

    public static String reverseStringFor(String str) {
        char[] charStr = str.toCharArray();
        char temp;
        for (int i = 0; i < charStr.length / 2; i++) {
            temp = charStr[i];
            charStr[i] = charStr[charStr.length - i - 1];
            charStr[charStr.length - i - 1] = temp;
        }
        return new String(charStr);
    }
}
