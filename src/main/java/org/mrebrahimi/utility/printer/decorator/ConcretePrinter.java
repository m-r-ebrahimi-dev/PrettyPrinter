package org.mrebrahimi.utility.printer.decorator;

public abstract class ConcretePrinter implements Printer {

    private final Printer printer;

    public ConcretePrinter(Printer printer) {
        this.printer = printer;
    }

    public Printer getPrinter() {
        return printer;
    }
}
