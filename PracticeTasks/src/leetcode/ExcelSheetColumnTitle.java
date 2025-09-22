package leetcode;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(10));
        System.out.println(convertToTitle(15));
        System.out.println(convertToTitle(20));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while(columnNumber > 0) {
            columnNumber--;
            int remainder = columnNumber % 26;
            char letter = (char) ('A' + remainder);
            result.append(letter);
            columnNumber /= 2;
        }
        return result.reverse().toString();
    }
}
