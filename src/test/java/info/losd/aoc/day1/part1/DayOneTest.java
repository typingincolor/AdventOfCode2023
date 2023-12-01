package info.losd.aoc.day1.part1;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOneTest {
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

    @Test
    void testElfDocument() {
        ElfDocument builder = new ElfDocument();
        builder.add("1abc2").add("pqr3stu8vwx").add("a1b2c3d4e5f").add("treb7uchet");

        assertEquals(142, builder.calculate(),"Expecting 142");
    }

    @Test
    void testReadingFromFile() throws IOException {
        ElfDocument builder = new ElfDocument("/test.txt");

        assertEquals(142, builder.calculate(),"Expecting 142");
    }
}
