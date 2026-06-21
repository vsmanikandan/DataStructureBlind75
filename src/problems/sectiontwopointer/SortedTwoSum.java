package problems.sectiontwopointer;

import java.util.Arrays;

public class SortedTwoSum {
    //input is sorted array
    public void calculateIndexForTarget(int[] arr, int target) {
        int i=0,j=arr.length-1;
        int[] result = new int[2];
        while(i<j) {
            int sum = arr[i] + arr[j];
            if(target>sum) {
                i++;
            } else if (target<sum) {
                j--;
            } else if (target == sum) {
                result[0]=i;
                result[1]=j;
                break;
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        SortedTwoSum s = new SortedTwoSum();
        s.calculateIndexForTarget(new int[]{1,2,4,6,8,9,11}, 14);
    }
}
