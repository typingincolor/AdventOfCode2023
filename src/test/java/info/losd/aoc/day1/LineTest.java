package info.losd.aoc.day1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.example.info.losd.aoc.day1.Line;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {
    @Test
    @DisplayName("Check: 1abc2")
    void testSimpleTestCase(){
        Line line = new Line("1abc2");
        assertEquals(12, line.calculateCalibrationValue(), "Expecting 12");
    }
}
