public class Main {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(5, 8));
        System.out.println(convertToCentimeters(68));
    }

    public static double convertToCentimeters(int heightInInches) {
        //convert inches to centimeters and pass back CM as double
        //1cm = .39370 in or 1in = 2.54cm
        double centimeters = heightInInches * 2.54;
        return centimeters;
    }

    public static double convertToCentimeters(int feet, int inches) {
        //convert height to inches, then to centimeters and pass back CM as double
        //1cm = .39370 in
        int totalInches = (feet * 12) + inches;
        return convertToCentimeters(totalInches);
    }
}