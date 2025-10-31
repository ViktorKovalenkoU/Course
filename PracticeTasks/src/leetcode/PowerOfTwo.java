package leetcode;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwoAlgorithm(1));
        System.out.println(isPowerOfTwoAlgorithm(16));
        System.out.println(isPowerOfTwoAlgorithm(3));

        System.out.println(isPowerOfTwoBitManipulation(1));
        System.out.println(isPowerOfTwoBitManipulation(16));
        System.out.println(isPowerOfTwoBitManipulation(3));
    }

    public static boolean isPowerOfTwoAlgorithm(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

    public static boolean isPowerOfTwoBitManipulation(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
