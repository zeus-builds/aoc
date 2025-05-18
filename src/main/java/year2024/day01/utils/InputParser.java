package year2024.day01.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputParser {
    /**
     * Parses an input stream where each line contains two integers separated by three whitespaces
     * Returns a pair of list of integers
     */

    public static List<List<Integer>> parseLocationId(InputStream input) throws IOException {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s{3}");
                if(parts.length == 2) {
                    int leftValue = Integer.parseInt(parts[0]);
                    int rightValue = Integer.parseInt(parts[1]);
                    left.add(leftValue);
                    right.add(rightValue);
                }
            }
        }
        return Arrays.asList(left, right);
    }

    public static List<List<Integer>> safeInput(InputStream input) {
        try {
            return parseLocationId(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse input", e);
        }
    }
}
