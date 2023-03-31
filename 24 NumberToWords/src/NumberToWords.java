public class NumberToWords {
    public static void main(String[] args) {
        //test cases
//        System.out.println("getDigitCount Tests");
//        System.out.println(getDigitCount(0) + " Expected: 1");
        System.out.println(getDigitCount(900) + " Expected: 3");
//        System.out.println(getDigitCount(-12) + " Expected: -1");
//        System.out.println(getDigitCount(1000) + " Expected: 4");
//
//        System.out.println("reverse Tests");
//        System.out.println(reverse(-121) + " Expected: -121");
//        System.out.println(reverse(1212) + " Expected: 2121");
//        System.out.println(reverse(1234) + " Expected: 4321");
//        System.out.println(reverse(100) + " Expected: 1");
//
//        System.out.println("numberToWords tests");
//        numberToWords(123);
////        numberToWords(1010);
        numberToWords(900);
        numberToWords(979);
//        numberToWords(-12);
    }

    public static void numberToWords (int number) {
        int newNum = reverse(number);

        if (newNum < 0) {
            System.out.println("Invalid Value");
        }

        int temp = 0;
        int count = getDigitCount(number);

        while (newNum >= 0) {
            //because the digit may be bigger than just one digit, we should keep the original number intact
            //a temp number will house the current iteration modulus the number
            //the switch statement will determine what it needs to print.
            temp = newNum % 10;
            switch (temp) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid Value");
            }
            //we divide the number by 10 to remove the last digit
            if (newNum / 10 == 0) {
                break;
            } else {
                newNum /= 10;
            }
            count--;
        }
        for (int i = count; i > 1; i--) {
            System.out.println("Zero");
        }
    }

    public static int reverse (int number) {
        //check for negative, we don't want negatives to screw with our reversed number, we will make it negative at
        //the end
        boolean isNegative = (number < 0);
        if (isNegative) {
            number *= -1;
        }

        //initialize last digit and reversed digit
        int lastDigit = 0;
        int reverse = 0;

        while (number >= 1) {
            lastDigit = number % 10;  // Give last Digit
            reverse = reverse * 10 + lastDigit; // Add to our new reverse
            number /= 10; // get rid of last digit
        }

        //if negative then make it negative before we return it
        if (isNegative) {
            reverse *= -1;
        }
        return reverse;
    }

    public static int getDigitCount (int number) {
        //takes in number and returns the count of digits in that number
        //if negative, return -1;

        if (number < 0) {
            return -1;
        }

        int count = 1;

        while (number > 9) {
            number /= 10;
            count++;
        }

        return count;
    }
}
