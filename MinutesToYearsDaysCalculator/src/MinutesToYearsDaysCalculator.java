public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        //test cases
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-1);
    }

    public static void printYearsAndDays(long minutes) {
        int hours = (int) minutes / 60;
        int days = hours / 24;
        int years = days / 365;
        int remainderDays = days % 365;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(minutes + " min = " + years + " y and " + remainderDays + " d");
        }
    }
}
