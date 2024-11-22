package org.mrebrahimi.utility.printer.decorator.base;

import org.mrebrahimi.utility.printer.decorator.Printer;
import org.mrebrahimi.utility.printer.model.Printable;
import org.mrebrahimi.utility.printer.model.SimplePrintable;

public class SimplePrinter implements Printer {

    @Override
    public String makeSentences(Printable printable) {
        if (printable instanceof SimplePrintable simplePrintable) {
            return simplePrintable.getPrintable();
        } else {
            throw new IllegalArgumentException("Not a SimplePrintable");
        }
    }

}
