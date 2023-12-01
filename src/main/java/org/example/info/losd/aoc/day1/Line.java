package org.example.info.losd.aoc.day1;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private final String str;

    public Line(String s) {
        this.str = s;
    }

    public int calculateCalibrationValue() {
        StringBuilder calibrationValue = new StringBuilder();

        List<Character> digits = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c);
            }
        }

        calibrationValue.append(digits.getFirst()).append(digits.getLast());

        return Integer.parseInt(calibrationValue.toString());
    }
}
