import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0, count = 0;
        long average = 0;

        while (true) {
            try {
                int number = Integer.parseInt(scanner.nextLine());
                count++;
                sum += number;
                average = (long) Math.round((double) sum / (double) count);
            } catch (NumberFormatException e) {
                System.out.println("SUM = " + sum + " " + "AVG = " + average);
                break;
            }
        }
    }
}
