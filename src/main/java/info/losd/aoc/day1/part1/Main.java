package info.losd.aoc.day1.part1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ElfDocument builder;
        try {
            builder = new ElfDocument("/input.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.print(builder.calculate());
    }
}
