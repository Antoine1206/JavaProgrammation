package section7;

public class Printer {


    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            if (tonerLevel + tonerAmount > 100) {
                return -1;
            }
            tonerLevel = tonerLevel + tonerAmount;
            return tonerLevel;
        }
        return -1;
    }


    public int printPages(int pages){
       int pagesToPrint = pages;
       if(duplex){
           pagesToPrint = (pages / 2) + (pages % 2);
           System.out.println("Printing in duplex mode");
       }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }


    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));    //Mon tonerLevel
        System.out.println("initial page count " + printer.getPagesPrinted());   //pagePrinted = 0;

        int pagesPrinted = printer.printPages(4);
        System.out.println("pasges printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

    }

}
