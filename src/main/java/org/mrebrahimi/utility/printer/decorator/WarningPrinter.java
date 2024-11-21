package org.mrebrahimi.utility.printer.decorator;

import static org.mrebrahimi.utility.printer.util.Constants.YELLOW;

public class WarningPrinter extends ColorFulPrinter {
    public WarningPrinter(Printer printer) {
        super(printer);
    }

    @Override
    String getColor() {
        return YELLOW;
    }

}
