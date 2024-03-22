public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = -1;
        for (int i = 2; i <= number; i++) {
            boolean isFactor = number % i == 0;

            if (isFactor) {
                boolean factorIsPrime = true;

                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        factorIsPrime = false;
                        break;
                    }
                }

                if (factorIsPrime) {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }
}
