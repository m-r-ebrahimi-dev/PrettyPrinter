package org.mrebrahimi.utility.printer.decorator.base;

import org.mrebrahimi.utility.printer.decorator.Printer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public abstract class DelimiterPrinter implements Printer {
    private final List<DelimiterType> delimiterType;

    protected DelimiterPrinter(DelimiterType... delimiterType) {
        this.delimiterType = Arrays.asList(delimiterType);
    }

    public List<DelimiterType> getDelimiterType() {
        return delimiterType;
    }

    public String getDelimiterTypeJoined() {
        return getDelimiterType().stream().map(DelimiterType::toString).collect(Collectors.joining());
    }
}
