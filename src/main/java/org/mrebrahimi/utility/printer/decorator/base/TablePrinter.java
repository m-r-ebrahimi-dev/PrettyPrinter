package org.mrebrahimi.utility.printer.decorator.base;

import org.mrebrahimi.utility.printer.model.DimentionPrintable;
import org.mrebrahimi.utility.printer.model.Printable;

import java.util.List;

public abstract class TablePrinter extends DimensionDelimiterPrinter {
    public TablePrinter(List<DelimiterType> rowDelimiterType, List<DelimiterType> columnDelimiterType) {
        super(rowDelimiterType, columnDelimiterType);
    }

    @Override
    public String makeSentences(Printable printable) {
        if (printable instanceof DimentionPrintable dimentionPrintable) {
            return printTable(dimentionPrintable.getPrintable());
        } else {
            throw new IllegalArgumentException("Not a DimensionPrintable");
        }
    }

    public abstract String printTable(List<List<String>> printable);
}
