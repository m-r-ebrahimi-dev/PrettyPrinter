package org.mrebrahimi.utility.printer.model;

public class SimplePrintableObject extends SimplePrintable {
    private final Object obj;

    public SimplePrintableObject(Object obj) {
        this.obj = obj;
    }

    @Override
    public String getPrintable() {
        return obj.toString();
    }
}
