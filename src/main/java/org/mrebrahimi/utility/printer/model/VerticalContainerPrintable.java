package org.mrebrahimi.utility.printer.model;

import java.util.stream.Collectors;

public class VerticalContainerPrintable extends ContainerPrintable {
    public VerticalContainerPrintable(String discriminator) {
        super(discriminator);
    }

    @Override
    public String getDiscriminator() {
        String discriminator = super.getDiscriminator();
//        getPrintables().
        return  "\n".concat(discriminator).concat("\n");
    }

    @Override
    public String getString() {
        return printables.stream()
                .map(Printable::getString)
                .collect(Collectors.joining(getDiscriminator()));
    }
}
