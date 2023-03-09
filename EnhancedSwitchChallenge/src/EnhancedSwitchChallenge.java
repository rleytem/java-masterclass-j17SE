public class EnhancedSwitchChallenge {
    public static void main(String[] args) {
        //test cases
        printDayOfWeek(0);
        printWeekDay(0);
        printDayOfWeek(1);
        printWeekDay(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printWeekDay(3);
        printDayOfWeek(4);
        printWeekDay(4);
        printDayOfWeek(5);
        printWeekDay(5);
        printDayOfWeek(6);
        printWeekDay(6);
        printDayOfWeek(7);
        printWeekDay(7);
        printDayOfWeek(-1);
        printWeekDay(-1);
    }
    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> day + " is a bad entry";
        };
            System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day) {
        if (day >= 1 && day <= 5) {
            System.out.println("This is a weekday");
        } else if (day == 0 || day == 6) {
            System.out.println("This is a weekend");
        } else {
            System.out.println("This is not a valid day");
        }
    }
}
