package org.mrebrahimi.utility.printer.decorator.base;

import java.util.List;

public class HorizontalPrinter extends AxisPrinter {
    public HorizontalPrinter(DelimiterType... delimiterType) {
        super(delimiterType);
    }

    @Override
    String printAxis(List<String> printable) {
        return String.join(getDelimiterTypeJoined(), printable);
    }
}
