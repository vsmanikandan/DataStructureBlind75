package problems.sectiontwopointer;

public class MaxWater {

    public int calculateMaxWaterCapacity(int[] arr) {
        int i=0,j=arr.length-1;
        int maxCapacity = 0;
        while(i<j) {
            int area = Math.min(arr[i], arr[j])*(j-i);
            maxCapacity = Math.max(maxCapacity, area);
            if(arr[i]<arr[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxCapacity;
    }

    public static void main(String[] args) {
        MaxWater m = new MaxWater();
        System.out.println(m.calculateMaxWaterCapacity(new int[]{1,8,6,2,5,4,8,6,7}));
    }
}
