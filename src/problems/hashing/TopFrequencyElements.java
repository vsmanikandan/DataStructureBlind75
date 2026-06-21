package problems.hashing;

import java.util.*;

public class TopFrequencyElements {

    public List<Integer> findTopFrequentElements(int[] arr, int freq) {
        Map<Integer, Integer> freqMap =  new HashMap<>();

        for(int i: arr) {
            freqMap.merge(i, 1,Integer::sum);
        }
        List<Integer>[] bucket = new List[arr.length+1];
        for(Map.Entry<Integer, Integer> entry :  freqMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            if(bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(element);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i >=0 && result.size() < freq; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    if (result.size() == freq) break;
                    result.add(num);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TopFrequencyElements t = new TopFrequencyElements();
        List<Integer> top = t.findTopFrequentElements(new int[]{1, 2, 2, 3, 3, 3,3, 4, 4, 4, 4, 6,6,6,6,6,6}, 2);
        System.out.println(top);
    }
}
