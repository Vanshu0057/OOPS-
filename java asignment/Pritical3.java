interface Printable {
    void printDocument();
}

interface Scannable {
    void scanDocument();
}

class Machine {
    void powerOn() {
        System.out.println("Machine is powered on.");
    }
}

class AllInOnePrinter extends Machine implements Printable, Scannable {
    @Override
    public void printDocument() {
        System.out.println("Printing document...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning document...");
    }
}

public class Pritical3 {
    public static void main(String[] args) {
        AllInOnePrinter printer = new AllInOnePrinter();

        printer.powerOn();
        printer.printDocument();
        printer.scanDocument();
    }
}