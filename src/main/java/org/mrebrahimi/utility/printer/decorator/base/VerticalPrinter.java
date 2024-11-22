package org.mrebrahimi.utility.printer.decorator.base;

import java.util.List;

public class VerticalPrinter extends AxisPrinter {
    public VerticalPrinter(DelimiterType... delimiterType) {
        super(delimiterType);
    }

    private String getRealDelimiter(List<String> printable) {
        int maxLength = printable.stream().mapToInt(String::length).max().orElse(0);
        StringBuilder delimiterBuilder = new StringBuilder(maxLength);
        delimiterBuilder.append("\n");
        for (int i = 0; i < maxLength; i++) {
            delimiterBuilder.append(getDelimiterTypeJoined());
        }
        delimiterBuilder.append("\n");
        return delimiterBuilder.toString();
    }

    @Override
    String printAxis(List<String> printable) {
        String realDelimiter = getRealDelimiter(printable);
        return String.join(realDelimiter, printable);
    }
}
