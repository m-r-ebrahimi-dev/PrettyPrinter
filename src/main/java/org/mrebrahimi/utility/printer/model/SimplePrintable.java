package org.mrebrahimi.utility.printer.model;

public class SimplePrintable implements Printable {
    private final String text;

    public SimplePrintable(String text) {
        this.text = text;
    }

    @Override
    public String getString() {
        return text;
    }
}
