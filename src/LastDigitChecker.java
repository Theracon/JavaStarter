public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }

        int firstLastDigit = first % 10;
        int secondLastDigit = second % 10;
        int thirdLastDigit = third % 10;

        return (firstLastDigit == secondLastDigit) ||
                (firstLastDigit == thirdLastDigit) ||
                (secondLastDigit == thirdLastDigit);
    }

    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }
}
