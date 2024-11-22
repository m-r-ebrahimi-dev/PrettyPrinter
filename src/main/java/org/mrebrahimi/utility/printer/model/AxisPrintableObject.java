package org.mrebrahimi.utility.printer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AxisPrintableObject extends AxisPrintable {
    private final List<SimplePrintable> objects;

    public AxisPrintableObject() {
        this.objects = new ArrayList<>();
    }

    public AxisPrintableObject addSimplePrintable(SimplePrintable obj) {
        this.objects.add(obj);
        return this;
    }

    public AxisPrintableObject removeSimplePrintable(SimplePrintable obj) {
        this.objects.remove(obj);
        return this;
    }

    @Override
    public List<String> getPrintable() {
        return objects.stream().map(SimplePrintable::getPrintable).collect(Collectors.toList());
    }
}
