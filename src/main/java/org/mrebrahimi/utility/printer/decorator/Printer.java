package org.mrebrahimi.utility.printer.decorator;

import org.mrebrahimi.utility.printer.model.Printable;

public interface Printer {
    String makeSentences(Printable text);

    default void print(Printable text) {
        System.out.println(makeSentences(text));
    }
}
