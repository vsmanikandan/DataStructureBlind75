package problems.sectiontwopointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    public Set<List<Integer>> calculateThreeSum(int[] arr, int target){
        Arrays.sort(arr);
        Set<List<Integer>> resultSet = new HashSet<>();
        for(int i=0;i<arr.length-2;i++) {
            int m=i+1,n=arr.length-1;
            while(m<n) {
                int sum = arr[i]+arr[m]+arr[n];
                if(sum == target) {
                    resultSet.add(Arrays.asList(arr[i],arr[m],arr[n]));
                    m++;
                    n--;
                } else if(sum<target) {
                    m++;
                } else if(sum>target) {
                    n--;
                }
            }
        }
        return resultSet;
    }

    public static void main(String[] args) {
        ThreeSum t = new ThreeSum();
        System.out.println(t.calculateThreeSum(new int[]{-1,1,0,2,-4,-1}, -6));
    }

}
