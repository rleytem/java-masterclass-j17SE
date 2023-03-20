public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }
        int count = 0;
        int largestDiv = 0;
        //find factors
        for (int i = 2; i < number/2; i++) {
            //check first if number is a factor then check if its prime, if prime, capture it in largestDiv
            if (number % i == 0) {
                for (int j = 1; j <= i; j++) {

                    if (i % j == 0) {
                        count++;
                    }
                }
                if (!(count > 2)) {
                    largestDiv = i;
                    count = 0;
                }
            }
        }
        if (largestDiv == 0) {
            largestDiv = number;
        }
        return largestDiv;
    }
}
