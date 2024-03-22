public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        int wholeNumberMegaBytesValue = kiloBytes / 1024;
        int remainderKiloBytesValue = kiloBytes % 1024;
        String message = kiloBytes + " KB = " + wholeNumberMegaBytesValue + " MB and "
                + remainderKiloBytesValue + " KB";

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(message);
    }
}
