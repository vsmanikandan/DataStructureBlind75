package problems.hashing;

import java.util.HashMap;
import java.util.Map;

public class LongetSeries {

    public int longestSeries(int[] arr) {
        Map<Integer, Boolean> visitedMap = new HashMap<>();
        int maxLength = 0;
        for (int i : arr) {
            visitedMap.put(i, false);
        }

        for(int i : arr) {
            int curr_Length = 1;
            int nextNum = i+1;
            while(visitedMap.containsKey(nextNum) && !visitedMap.get(nextNum)) {
                curr_Length = curr_Length+1;
                visitedMap.put(nextNum, true);
                nextNum = nextNum+1;
            }

            int prev_num = i-1;
            while(visitedMap.containsKey(prev_num) && !visitedMap.get(prev_num)) {
                curr_Length = curr_Length+1;
                visitedMap.put(prev_num, true);
                prev_num = prev_num-1;
            }
            maxLength = Math.max(maxLength, curr_Length);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongetSeries obj = new LongetSeries();
        int[] arr = {5, 43, 0, 111, 333, 2};
        System.out.println(obj.longestSeries(arr));
    }
}
