package year2024.day01;

import java.util.Collections;
import java.util.List;

public class Part1Solver {
    public static int solve(List<List<Integer>> locationId) {
        Collections.sort(locationId.get(0));
        Collections.sort(locationId.get(1));
        int res = 0;
        for (int i = 0; i < locationId.get(0).size(); i++) {
            res += Math.abs(locationId.get(0).get(i) - locationId.get(1).get(i));
        }
        return res;
    }
}
