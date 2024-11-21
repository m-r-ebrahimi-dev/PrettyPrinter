package org.mrebrahimi.utility.printer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class ContainerPrintable implements Printable {
    protected List<Printable> printables = new ArrayList<>();
    private final String discriminator;

    protected ContainerPrintable(String discriminator) {
        this.discriminator = discriminator;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public List<Printable> getPrintables() {
        return printables;
    }

    public ContainerPrintable addPrintable(Printable printable) {
        printables.add(printable);
        return this;
    }

    public ContainerPrintable removePrinter(Printable printable) {
        printables.remove(printable);
        return this;
    }

    @Override
    public abstract String getString();
}
