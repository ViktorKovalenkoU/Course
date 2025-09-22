package leetcode;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climb(4));
        System.out.println(climb(12));
        System.out.println(climb(42));
    }

    public static int climb(int n) {
        if(n <= 2) {
            return n;
        }
        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
