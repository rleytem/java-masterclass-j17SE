public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(100);
    }

    public static void printSquareStar(int number) {
        if ((number < 5)) {
            System.out.println("Invalid Value");
        } else {

            //we loop through the rows, because once we print we cannot go back
            for (int row = 1; row <= number; row++) {
                //print rows 0 and n-1
                if (row == 1 || row == (number)) {
                    for (int i = 0; i < number; i++) {
                        System.out.print("*");
                    }
                } else {
                    //print any other rows
                    for (int column = 1; column <= number; column++) {
                        //print the column 0 star
                        if (column == 1 || column == number) {
                            System.out.print("*");
                        } else if (column == ((number - row) + 1)) {
                            System.out.print("*");
                        } else if ((row == column) && (row != 0 || row != number)) {
                            System.out.print("*");
                        } else {
                            if (column != number) {
                                System.out.print(" ");
                            } else {
                                System.out.print("");
                            }
                        }
                    }
                }
                if (row != number) {
                    System.out.println("");
                }

            }
        }
    }
}