package year2024.day01;

import org.junit.jupiter.api.Test;
import year2024.day01.utils.InputParser;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Day01SolverTest {

    @Test
    public void sampleTestPart1() {
        InputStream input = getClass().getClassLoader().getResourceAsStream("year2024/day01/sample.txt");

        assertNotNull(input, "Test file not found");

        var pairs = InputParser.safeInput(input);
        int result = Part1Solver.solve(pairs);
        assertEquals(11, result);
    }
}
