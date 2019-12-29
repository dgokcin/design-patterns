package structural.proxy.ex2;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("Current name is " + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("Current name is " + p.getPrinterName());
        p.print("Hello, World");
    }
}

