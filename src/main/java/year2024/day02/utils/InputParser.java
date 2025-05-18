package year2024.day02.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputParser {
    /**
     * Parses an input stream where each line contains a list of integers separated by whitespaces
     * Returns a list containing lists of integers
     */

    public static List<List<Integer>> parseReports(InputStream input) throws IOException {
        List<List<Integer>> reports = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            String line;
            while((line = reader.readLine()) != null) {
                List<Integer> levels = Arrays.stream(line.split("\\s")).map(Integer::parseInt).toList();
                reports.add(levels);
            }
        }
        return reports;
    }

    public static List<List<Integer>> safeInput(InputStream input) {
        try {
            return parseReports(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse the input", e);
        }
    }
}
