package info.losd.aoc.day1.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ElfDocument {
    private final List<Line> lines = new ArrayList<>();

    public ElfDocument() {

    }

    public ElfDocument(String s) throws IOException {
        Class<ElfDocument> clazz = ElfDocument.class;
        InputStream inputStream = clazz.getResourceAsStream(s);
        assert inputStream != null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(new Line(line));
            }
        }
    }

    public ElfDocument add(String s) {
        lines.add(new Line(s));
        return this;
    }

    public int calculate() {
        int total = 0;
        for (Line line : lines) {
            total += line.calculateCalibrationValue();
        }

        return total;
    }
}
