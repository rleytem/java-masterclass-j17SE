public class MegaBytesConverter {
    public static void main(String[] args) {
        //test cases
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        //1MB = 1024kb
        int megaBytes = kiloBytes / 1024;
        int remainKB = kiloBytes % 1024;

        if (kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = "
                    + megaBytes + " MB and "
                    + remainKB + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
