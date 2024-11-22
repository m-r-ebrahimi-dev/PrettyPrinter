package org.mrebrahimi.utility.printer.decorator.concrete;

import org.mrebrahimi.utility.printer.decorator.Printer;
import org.mrebrahimi.utility.printer.model.Printable;

import static org.mrebrahimi.utility.printer.util.Constants.BOLD;

public class BoldPrinter extends ConcretePrinter {
    public BoldPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public String makeSentences(Printable text) {
        return BOLD + getPrinter().makeSentences(text) ;
    }
}
