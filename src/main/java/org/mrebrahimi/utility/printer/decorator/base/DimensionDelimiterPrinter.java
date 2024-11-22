package org.mrebrahimi.utility.printer.decorator.base;

import org.mrebrahimi.utility.printer.decorator.Printer;

import java.util.List;
import java.util.stream.Collectors;

public abstract class DimensionDelimiterPrinter implements Printer {
    private List<DelimiterType> rowDelimiterType;
    private List<DelimiterType> columnDelimiterType;

    public DimensionDelimiterPrinter(List<DelimiterType> rowDelimiterType, List<DelimiterType> columnDelimiterType) {
        this.rowDelimiterType = rowDelimiterType;
        this.columnDelimiterType = columnDelimiterType;
    }

    public List<DelimiterType> getRowDelimiterType() {
        return rowDelimiterType;
    }

    public void setRowDelimiterType(List<DelimiterType> rowDelimiterType) {
        this.rowDelimiterType = rowDelimiterType;
    }

    public List<DelimiterType> getColumnDelimiterType() {
        return columnDelimiterType;
    }

    public void setColumnDelimiterType(List<DelimiterType> columnDelimiterType) {
        this.columnDelimiterType = columnDelimiterType;
    }

    public String getRowDelimiterTypeJoined() {
        return getRowDelimiterType().stream().map(DelimiterType::toString).collect(Collectors.joining());
    }

    public String getColumnDelimiterTypeJoined() {
        return getColumnDelimiterType().stream().map(DelimiterType::toString).collect(Collectors.joining());
    }
}
