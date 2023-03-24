public class LastDigitChecker {

    public static void main(String[] args) {
        //test cases
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        //goal of method is to return true if at least two of the numbers share the same right most
        //digit, otherwise return false
        //inclusive range of 10 - 1000

        if ((isValid(num1) == false || isValid(num2) == false || isValid(num3) == false)) {
            return false;
        } else {
            int new1 = num1 % 10;
            int new2 = num2 % 10;
            int new3 = num3 % 10;

            if ((new1 == new2) || (new1 == new3) || (new2 == new3)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isValid(int num1) {
        if (num1 <= 9 || num1 >= 1001) {
            return false;
        } else {
            return true;
        }
    }
}
