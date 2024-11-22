package org.mrebrahimi.utility.printer.decorator.base;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimaryTablePrinter extends TablePrinter {
    public PrimaryTablePrinter(List<DelimiterType> rowDelimiterType, List<DelimiterType> columnDelimiterType) {
        super(rowDelimiterType, columnDelimiterType);
    }

    @Override
    public String printTable(List<List<String>> printable) {
        List<String> lines = new ArrayList<>();
        List<Integer> columnWidths = new ArrayList<>();
        int columnCount = printable.get(0).size();

        for (int col = 0; col < columnCount; col++) {
            int maxWidth = 0;
            for (List<String> row : printable) {
                if (col < row.size()) {
                    maxWidth = Math.max(maxWidth, row.get(col).length());
                }
            }
            columnWidths.add(maxWidth);
        }

        for (List<String> row : printable) {
            String line = IntStream.range(0, row.size())
                    .mapToObj(i -> new AbstractMap.SimpleEntry<>(i, row.get(i)))
                    .map(map -> String.format("%-" + columnWidths.get(map.getKey()) + "s", map.getValue()))
                    .collect(Collectors.joining(getRowDelimiterTypeJoined()));
            lines.add(line);
        }
        String rowDelimiter = getRealDelimiter(columnWidths);
        return String.join(rowDelimiter, lines);
    }

    private String getRealDelimiter(List<Integer> columnWidths) {
        Integer maxLength = columnWidths.stream().reduce(Integer::sum).orElse(0);
        maxLength += (columnWidths.size() - 1) * getRowDelimiterTypeJoined().length();
        StringBuilder delimiterBuilder = new StringBuilder(maxLength);
        delimiterBuilder.append("\n");
        for (int i = 0; i < maxLength; i++) {
            delimiterBuilder.append(getColumnDelimiterTypeJoined());
        }
        delimiterBuilder.append("\n");
        return delimiterBuilder.toString();
    }
}
