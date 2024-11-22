package org.mrebrahimi.utility.printer.model;

import java.util.List;

public abstract class DimentionPrintable implements Printable {
    public abstract List<List<String>> getPrintable();
}
