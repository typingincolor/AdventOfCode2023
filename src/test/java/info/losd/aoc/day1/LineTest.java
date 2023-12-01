package info.losd.aoc.day1;

import org.junit.jupiter.api.Test;
import org.example.info.losd.aoc.day1.Line;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {
    @Test
    void testDigitsAtBeginningAndEnd(){
        Line line = new Line("1abc2");
        assertEquals(12, line.calculateCalibrationValue(), "Expecting 12");
    }

    @Test
    void testDigitsInMiddle(){
        Line line = new Line("pqr3stu8vwx");
        assertEquals(38, line.calculateCalibrationValue(), "Expecting 38");
    }

    @Test
    void testMultipleDigits(){
        Line line = new Line("a1b2c3d4e5f");
        assertEquals(15, line.calculateCalibrationValue(), "Expecting 15");
    }

    @Test
    void testSingleDigit(){
        Line line = new Line("treb7uchet");
        assertEquals(77, line.calculateCalibrationValue(), "Expecting 77");
    }
}
