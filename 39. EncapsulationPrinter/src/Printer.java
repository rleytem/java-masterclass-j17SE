public class Printer {

    //initialize instance variables
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    //constructor
    public Printer(int tonerLevel, boolean duplex) {

        //pagesPrinted is passed created at 0
        this.pagesPrinted = 0;
        //check to see if valid parameter is passed for tonerLevel
        //if invalid, return -1 for an invalid amount
        if (tonerLevel < 0 || tonerLevel >= 100) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        //pass in duplex
        this.duplex = duplex;
    }

    //addToner method, takes in tonerAmount to add
    public int addToner (int tonerAmount) {

        //tempAmount adds tonerLevel and the argument tonerAmount together
        int tempAmount = this.tonerLevel + tonerAmount;
        //check to make sure that the argument passed in is valid, if it is, check again if the new temp amount is
        //less than 100, else return -1 for an invalid amount;
        //otherwise return the temp amount
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tempAmount > 100) {
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return tempAmount;
            }
        } else {
            return -1;
        }
    }

    //printPages method takes in an amount of pages to print
    //if its a duplex printer it can print on both sides of the sheet of paper

    public int printPages (int pages) {

        //initialize a "temp" variable for the amount of pages to print
        int pagesToPrint = pages;

        //conditional checker if printer is duplex or not
        //if this.duplex == true, the printer can print double-sided
        //pages/2 and pages%2 returns the divided pages and the remainder as the amount to print
        //otherwise we just return the original pagesToPrint if the printer is not a duplex.
        //we also add this to class field pagesPrinted to keep track of how many pages we printed
        if (this.duplex) {
            System.out.println("Printing in duplex mode");
            pagesToPrint = ((pages / 2) + (pages % 2));
        }
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
    }

    //getter for pages printed
    public int getPagesPrinted () {
        return this.pagesPrinted;
    }
}
