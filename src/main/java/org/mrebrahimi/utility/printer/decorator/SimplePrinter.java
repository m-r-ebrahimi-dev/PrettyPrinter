package org.mrebrahimi.utility.printer.decorator;

import org.mrebrahimi.utility.printer.model.Printable;

public class SimplePrinter implements Printer {

    @Override
    public String makeSentences(Printable text) {
        return text.getString();
    }
}
