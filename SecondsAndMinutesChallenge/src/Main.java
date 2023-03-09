public class Main {
    public static void main(String[] args) {
    //test cases:
        System.out.println(getDurationString(55));
        System.out.println(getDurationString(-5));
        System.out.println(getDurationString(-5,5));
        System.out.println(getDurationString(75));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString (int seconds) {
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;
        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;

        if (seconds < 0) {
            return "Cannot compute negative or no seconds!";
        } else {
            return (hours + "h " + remainderMinutes + "m " + remainderSeconds + "s");
        }
    }

    public static String getDurationString (int minutes, int seconds) {
        int newSeconds = (minutes * 60) + seconds;

        if ((minutes < 0) || (seconds < 0 || seconds > 60)) {
            return "Invalid seconds or minutes, please check your entries and try again";
        } else {
            return getDurationString(newSeconds);
        }
    }
}