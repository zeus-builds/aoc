package year2024.day01;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Part2Solver {
    public static int solve(List<List<Integer>> locationId) {
        Collections.sort(locationId.get(0));
        Collections.sort(locationId.get(1));
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int element : locationId.get(1)) {
            freq.put(element, freq.getOrDefault(element, 0) + 1);
        }
        int res = 0;
        for (int p : locationId.get(0)) {
            res += p * freq.getOrDefault(p, 0);
        }
        return res;
    }
}
