public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println("---");

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println("---");

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reverse = reverse(number);
        int numberDigitCount = getDigitCount(number);
        int reverseDigitCount = getDigitCount(reverse);
        int digitCountDifference = numberDigitCount - reverseDigitCount;

        while (reverse > 9) {
            int lastDigit = reverse % 10;
            System.out.println(getNumberWord(lastDigit));
            reverse /= 10;
        }
        System.out.println(getNumberWord(reverse));

        for (int i = 0; i < digitCountDifference; i++) {
            System.out.println("Zero");
        }
    }

    public static String getNumberWord(int number) {
        return switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "";
        };
    }

    public static int reverse(int number) {
        int originalNumber = number;
        int reverse = 0;

        if (number < 0) {
            number *= -1;
        }

        while (number > 9) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
            if (number % 10 == number) {
                break;
            }
        }
        reverse = (reverse * 10) + number;

        if (originalNumber < 0) {
            reverse *= -1;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        while (number > 9) {
            count++;
            number /= 10;
        }

        return ++count;
    }
}
