package year2024.day02;

import java.util.List;

public class Part1Solver {
    private static boolean isIncreasing(List<Integer> levels) {
        for(int i = 1; i < levels.size(); i++) {
            if(levels.get(i) < levels.get(i - 1)) return false;
        }
        return true;
    }

    private static boolean isDecreasing(List<Integer> levels) {
        for(int i = 1; i < levels.size(); i++) {
            if(levels.get(i) > levels.get(i - 1)) return false;
        }
        return true;
    }

    private static boolean isInRange(List<Integer> levels) {
        for(int i = 1; i < levels.size(); i++) {
            int diff = Math.abs(levels.get(i) - levels.get(i - 1));
            if(diff < 1 || diff > 3) return false;
        }
        return true;
    }

    private static boolean isSafe(List<Integer> levels) {
        return (isIncreasing(levels) || isDecreasing(levels)) && isInRange(levels);
    }

    public static int solve(List<List<Integer>> reports) {
        int res = 0;
        for(List<Integer> levels: reports) {
            if(isSafe(levels)) res++;
        }
        return res;
    }
}
