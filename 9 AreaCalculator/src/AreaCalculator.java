public class AreaCalculator {
    public static void main(String[] args) {
        //test cases
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0,4.0));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            //area of circle is radius * radius * PI
            //use Math.PI constant
            double area = (radius * radius * Math.PI);
            return area;
        }
    }

    public static double area (double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            double area = (x * y);
            return area;
        }
    }
}
