package structural.proxy.ex2;

public class PrinterProxy implements Printable {
    private String name;
    private Printer real;

    public PrinterProxy(){
    }

    public PrinterProxy(String name){
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    // creates a new real printer
    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }

}
