package org.mrebrahimi.utility.printer.decorator.concrete;

import org.mrebrahimi.utility.printer.decorator.Printer;
import org.mrebrahimi.utility.printer.model.Printable;

import static org.mrebrahimi.utility.printer.util.Constants.RESET;

public abstract class ColorFulPrinter extends ConcretePrinter {
    public ColorFulPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public String makeSentences(Printable text) {
        return getColor() + getPrinter().makeSentences(text) + RESET;
    }

    abstract String getColor();
}
