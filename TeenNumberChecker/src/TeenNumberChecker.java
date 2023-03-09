public class TeenNumberChecker {
    public static void main(String[] args) {
        //test cases
        System.out.println("hasTeen Method");
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

        System.out.println("isTeen Method");
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        //teenager for this purpose is anyone of ages 13 - 19
        if ((age1 >= 13 && age1 <= 19) || (age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int age1) {
        if (age1 >= 13 && age1 <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
