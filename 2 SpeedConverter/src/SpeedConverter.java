public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0){
            //calculate mph from kph
            //1 mph == 1.609kph
            double result = kilometersPerHour/1.609;
            long roundedResult = Math.round(result);
            return roundedResult;
        } else {
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        long mph = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
