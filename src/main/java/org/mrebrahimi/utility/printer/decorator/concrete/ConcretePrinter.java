package org.mrebrahimi.utility.printer.decorator.concrete;

import org.mrebrahimi.utility.printer.decorator.Printer;

public abstract class ConcretePrinter implements Printer {

    private final Printer printer;

    public ConcretePrinter(Printer printer) {
        this.printer = printer;
    }

    public Printer getPrinter() {
        return printer;
    }
}
