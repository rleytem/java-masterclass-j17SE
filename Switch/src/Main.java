public class Main {
    public static void main(String[] args) {

//        int value = 1;
//
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was actually a 3, a 4 or a 5");
                System.out.println("Actually it was a " + switchValue);
            default:
                System.out.println("Was not 1, 2, 3, 4, 5");
                break;
        }

        String month = "OCT";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter!");
    }
    public static String getQuarter(String month) {

        return switch (month) {
            case "JAN", "FEB", "MAR" -> "1ST";
            case "APR", "MAY", "JUN" -> "2ND";
            case "JUL", "AUG", "SEP" -> "3RD";
            case "OCT", "NOV", "DEC" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }
}
