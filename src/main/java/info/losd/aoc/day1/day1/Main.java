package info.losd.aoc.day1.day1;

import info.losd.aoc.day1.ElfDocument;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        Class<Main> clazz = Main.class;
        InputStream inputStream = clazz.getResourceAsStream("/input.txt");
        ElfDocument builder;
        try {
            builder = new ElfDocument(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.print(builder.calculate());
    }
}
