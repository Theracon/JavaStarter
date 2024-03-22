public class DecimalComparator {
    public static void main(String[] args) {
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
//        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
//        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));

        System.out.println(areEqualByThreeDecimalPlaces(3.174, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        if (firstNumber == secondNumber) {
            return true;
        }

        int firstNumberWholeNumberPart = (int) firstNumber;
        int secondNumberWholeNumberPart = (int) secondNumber;

        if (firstNumberWholeNumberPart != secondNumberWholeNumberPart) {
            return false;
        }

        double firstNumberDecimalPart = firstNumber - firstNumberWholeNumberPart;
        double secondNumberDecimalPart = secondNumber - secondNumberWholeNumberPart;

        float difference;
        if (firstNumberDecimalPart > secondNumberDecimalPart) {
            difference = (float ) (firstNumberDecimalPart - secondNumberDecimalPart);
        } else {
            difference = (float) (secondNumberDecimalPart - firstNumberDecimalPart);
        }

        System.out.println(difference);
        return  difference < 1e-3;
    }
}
