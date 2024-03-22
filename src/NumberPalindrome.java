public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(797));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        int originalNumber = number;
        int reverse = 0;

        while (number > 9) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
            if (number % 10 == number) {
                break;
            }
        }

        reverse = (reverse * 10) + number;

        return reverse == originalNumber;
    }
}
