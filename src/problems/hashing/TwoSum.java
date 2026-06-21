package problems.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public int[] findIndexes(int[] array, int target)    {
        Map<Integer, Integer> numKeyMap =  new HashMap<>();
        int[] indexes = new int[2];
        for(int i=0; i< array.length; i++) {
            int rem = target - array[i];
            if(!numKeyMap.containsKey(rem)) {
                numKeyMap.put(array[i], i);
            } else {
                indexes[0] = i;
                indexes[1] =  numKeyMap.get(rem);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] array = {2,6,4,7,8,9,5};
        System.out.println(Arrays.toString(t.findIndexes(array, 15)));
    }
}
