package year2024.day01;

import year2024.day01.utils.InputParser;

import java.io.InputStream;
import java.util.List;

public class Day01Part1Solver {
    public static int solve(List<int[]> pairs) {
        List<Integer> left = pairs.stream().map(p -> p[0]).sorted().toList();
        List<Integer> right = pairs.stream().map(p -> p[1]).sorted().toList();

        int res = 0;
        for (int i = 0; i < left.size(); i++) {
            res += Math.abs(left.get(i) - right.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
        InputStream input = Day01Part1Solver.class.getClassLoader().getResourceAsStream("year2024/day01/input.txt");

        if (input == null) {
            System.out.println("Input file not found.");
            return;
        }

        var pairs = InputParser.safeInput(input);
        int answer = solve(pairs);
        System.out.println("Part 1: " + answer);
    }
}
