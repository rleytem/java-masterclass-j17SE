public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        //method should return the greatest common divisor of the two numbers
        //greatest common divisor is the largest positive integet that can fully divide each integer w/o remainder

        //return -1 if one of numbers is less than 10
        if (first < 10 || second < 10) {
            return -1;
        }

        //declare local variables, max1 and max2 will capture the highest common divisor
        //count is our iterator
        //lowest is the lowest of the two inputed number and our while loop will only run into we get to that number
        //as any number higher than one of the inputed numbers cannot be a divisor of a number lower than it.
        //temp variables to capture the curent divisor;

        int max1 = 0;
        int max2 = 0;
        int temp1 = 0;
        int temp2 = 0;
        int count = 1;
        int lowest;

        if (first > second) {
            lowest = second;
        } else {
            lowest = first;
        }

        while (count <= lowest) {
            if (first % count == 0) {
                temp1 = count;
            }
            if (second % count == 0) {
                temp2 = count;
            }
            if ((temp1 == temp2) && first % count == 0 && second % count == 0) {
                max1 = count;
                max2 = count;
            }
            count++;
        }
        if (max1 == max2) {
            return max1;
        } else {
            return -1;
        }
    }
}
