public class LeapYear {
    public static void main(String[] args) {
        //testcases
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        int four = year % 4;
        int oneHundred = year % 100;
        int fourHundred = year % 400;

        if (year >= 1 && year <= 9999) {

            if (four == 0) {
                if (oneHundred == 0) {
                    if (fourHundred == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
