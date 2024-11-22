package org.mrebrahimi.utility.printer.decorator.base;

import org.mrebrahimi.utility.printer.model.AxisPrintable;
import org.mrebrahimi.utility.printer.model.Printable;

import java.util.List;

public abstract class AxisPrinter extends DelimiterPrinter {
    public AxisPrinter(DelimiterType... delimiterType) {
        super(delimiterType);
    }

    @Override
    public String makeSentences(Printable printable) {
        if (printable instanceof AxisPrintable axisPrintable) {
            return printAxis(axisPrintable.getPrintable());
        } else {
            throw new IllegalArgumentException("Not a AxisPrintable");
        }
    }

    abstract String printAxis(List<String> printable);
}
