package org.mrebrahimi.utility.printer.decorator.base;

public enum DelimiterType {
    SPACE(" "),
    SHARP("#"),
    COMMA(","),
    UNDER_LINE("_"),
    DASH("-");
    private final String delimiter;

    DelimiterType(String delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String toString() {
        return delimiter;
    }
}
