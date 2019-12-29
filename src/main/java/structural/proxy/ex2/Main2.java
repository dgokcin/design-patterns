package structural.proxy.ex2;

public class Main2 {
    public static void main(String[] args) {
        Printable pm = new Printer();
        pm.setPrinterName("slowPrinter");
        System.out.println(pm.getPrinterName());
        //pm.print("Hello World");
    }
}

