public class Main {
    public static void main(String[] args) {
        // Converts 2500 KB to MB.
        printMegaBytesAndKiloBytes(2500);

        // Converts -1024 KB to MB.
        printMegaBytesAndKiloBytes(-1024);

        // Converts 5000 KB to MB.
        printMegaBytesAndKiloBytes(5000);
    }

    /**
     * Converts kilobytes to megabytes.
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        // Checks for invalid input.
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Converts kilobytes to megabytes.
        int megaBytes = kiloBytes / 1024;
        int remainingKiloBytes = kiloBytes - megaBytes * 1024;

        // Prints the conversion.
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
    }
}