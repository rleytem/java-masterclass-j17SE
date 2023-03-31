public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(33550336));
    }

    //perfect number is a positive integers which is equal to the sum of its proper positive divisors
    //proper positive divisors are positive integers that fully divide the perfect number with no remainders
    //AND exclude number itself.
    //ex. 6: 6's proper divisors are 1, 2, and 3. 1 + 2 + 3 == 6. Therefore 6 is a perfect number.

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;
        int count = 1;

        while (count < number) {
            if (number % count == 0) {
                sum += count;
            }
            count++;
        }
        if (number == sum) {
            return true;
        } else {
            return false;
        }
    }
}
