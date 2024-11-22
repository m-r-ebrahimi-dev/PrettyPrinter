package org.mrebrahimi.utility.printer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DimensionPrintableObject extends DimentionPrintable {
    private final List<AxisPrintable> objects;

    public DimensionPrintableObject() {
        objects = new ArrayList<>();
    }

    public DimensionPrintableObject addRow(AxisPrintable row) {
        objects.add(row);
        return this;
    }


    @Override
    public List<List<String>> getPrintable() {
        return objects.stream().map(AxisPrintable::getPrintable).collect(Collectors.toList());
    }
}
