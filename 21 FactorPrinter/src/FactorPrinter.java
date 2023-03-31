public class FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        //method should print out all factors of the number. The factor of a number is an integer which divides
        //from that number wholly without a remainder.
        //ex. 3 is a factor of 6.

        int count = 1;

        while (count <= number) {
            if (number % count == 0) {
                System.out.println(count);
            } else {
                count++;
                continue;
            }
            count++;
        }
    }
}
