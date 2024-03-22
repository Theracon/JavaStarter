public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long numDays = minutes / (60 * 24);
        long numYears = numDays / 365;
        long remainingDays = numDays % 365;
        String message = minutes + " min = " + numYears + " y and " + remainingDays + " d";

        System.out.println(message);
    }
}
