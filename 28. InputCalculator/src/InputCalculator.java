import java.util.Scanner;
public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        boolean keepGoing = true;
        double average = 0;

        while (keepGoing == true) {
            try {
                String num = scanner.nextLine();
                sum += Integer.parseInt(num);
                count++;
                average = Math.round(sum / count);
            } catch (NumberFormatException e) {
                keepGoing = false;
            }
        }
        System.out.println("SUM = " + (long) sum + " AVG = " + (long) average);
    }
}
