package org.mrebrahimi.utility.printer.decorator;

import org.mrebrahimi.utility.printer.model.Printable;

public interface Printer {
    String makeSentences(Printable printable);

    default void print(Printable printable) {
        System.out.println(makeSentences(printable));
    }
}
