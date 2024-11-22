package org.mrebrahimi.utility.printer.util;

import org.mrebrahimi.utility.printer.model.*;

import java.lang.reflect.Field;
import java.util.List;

public class PrintableConverter {
    public static Printable convert(String string) {
        return new SimplePrintableObject(string);
    }

    public static Printable convert(String... strings) {
        AxisPrintableObject axisPrintableObject = new AxisPrintableObject();
        for (String object : strings) {
            axisPrintableObject.addSimplePrintable(new SimplePrintableObject(object));
        }
        return axisPrintableObject;
    }

    public static Printable convert(Object object) {
        Class<?> clazz = object.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        String[] objects = new String[declaredFields.length];
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            field.setAccessible(true);
            try {
                objects[i] = field.getName().concat(": ").concat(field.get(object).toString());
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return convert(objects);
    }

    public static Printable convert(List<Object> objects) {
        DimensionPrintableObject printableObject = new DimensionPrintableObject();
        Class<?> clazz = objects.get(0).getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        String[] headers = new String[declaredFields.length];
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            field.setAccessible(true);
            headers[i] = field.getName();
        }
        printableObject.addRow((AxisPrintable) convert(headers));
        for (Object object : objects) {
            printableObject.addRow((AxisPrintable) primaryConvert(object));
        }
        return printableObject;
    }

    public static Printable primaryConvert(Object object) {
        Class<?> clazz = object.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        String[] objects = new String[declaredFields.length];
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];
            field.setAccessible(true);
            try {
                objects[i] = field.get(object).toString();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return convert(objects);
    }
}
