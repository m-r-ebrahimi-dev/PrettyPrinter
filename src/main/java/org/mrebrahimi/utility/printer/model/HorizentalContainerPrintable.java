package org.mrebrahimi.utility.printer.model;

import java.util.stream.Collectors;

public class HorizentalContainerPrintable extends ContainerPrintable {
    public HorizentalContainerPrintable(String discriminator) {
        super(discriminator);
    }

    @Override
    public String getDiscriminator() {
        return " ".concat(super.getDiscriminator()).concat(" ");
    }

    @Override
    public String getString() {
        return printables.stream()
                .map(Printable::getString)
                .collect(Collectors.joining(getDiscriminator()));
    }
}
