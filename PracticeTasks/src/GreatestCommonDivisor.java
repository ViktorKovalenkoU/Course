public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestDivisor(25,15));
        System.out.println(getGreatestDivisor(12, 30));
        System.out.println(getGreatestDivisor(9,18));
        System.out.println(getGreatestDivisor(81,153));
    }

    public static int getGreatestDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        while (second != 0){
            int temp = second;
            second = first % second;
            first = temp;
        }
     return first;
    }
}
