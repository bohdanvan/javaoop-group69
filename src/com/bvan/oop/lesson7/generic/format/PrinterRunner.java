package com.bvan.oop.lesson7.generic.format;

/**
 * @author bvanchuhov
 */
public class PrinterRunner {

    public static void main(String[] args) {
        Printer<Product> productPrinter = new Printer<>();
        productPrinter.add(new Product("MacBook", 2000));
        productPrinter.add(new Product("Lenovo", 1500));
        productPrinter.add(new Product("Asus", 1700));

        Formatter<Product> formatter = new ToStringFormatter<>();
        productPrinter.print(formatter);
        System.out.println();

        productPrinter.print(new NameFormatter());
        System.out.println();

        // -----

        Printer<Music> musicPrinter = new Printer<>();
        musicPrinter.add(new Music("ABC", "123"));
        musicPrinter.add(new Music("XYZ", "4"));

        musicPrinter.print(new ToStringFormatter<>());

        Formatter<Music> musicFormatter = new Formatter<Music>() {
            @Override
            public String format(Music value) {
                return value.getTitle();
            }
        };
        musicPrinter.print(musicFormatter);

        Formatter<Product> nameFormatter = p -> p.getName();


        Formatter<Music> authorFormatter = m -> m.getAuthor();

        Formatter<Music> csvFormatter = m -> m.getAuthor() + "," + m.getTitle();
    }
}
