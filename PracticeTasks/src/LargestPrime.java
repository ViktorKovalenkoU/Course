public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int maxPrime = 1;
        while (number % 2 == 0) {
            maxPrime = 2;
            number /= 2;
        }
        for (int i = 3; i <= number; i += 2) {
            while (number % i == 0) {
                maxPrime = i;
                number /= i;
            }
        }
        return maxPrime;
    }
}
