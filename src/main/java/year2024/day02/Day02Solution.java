package year2024.day02;

import year2024.day02.Part1Solver;
import year2024.day02.Part2Solver;
import year2024.day02.utils.InputParser;

import java.io.InputStream;

public class Day02Solution {
    public static void main(String[] args) {
        String filePath = "year2024/day02/input.txt";
        InputStream input = Day02Solution.class.getClassLoader().getResourceAsStream(filePath);
        if (input == null) {
            System.out.println("Input file not found.");
            return;
        }
        var locationId = InputParser.safeInput(input);
        int part1Solution = Part1Solver.solve(locationId);
//        int part2Solution = Part2Solver.solve(locationId);
        System.out.println("Part 1: " + part1Solution);
//        System.out.println("Part 2: " + part2Solution);
    }
}
