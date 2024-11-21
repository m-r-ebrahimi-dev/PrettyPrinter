package org.mrebrahimi.utility.printer.decorator;

import static org.mrebrahimi.utility.printer.util.Constants.RED;

public class ErrorPrinter extends ColorFulPrinter {
    public ErrorPrinter(Printer printer) {
        super(printer);
    }

    @Override
    String getColor() {
        return RED;
    }
}
