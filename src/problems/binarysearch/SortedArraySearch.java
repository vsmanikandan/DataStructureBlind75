package problems.binarysearch;

public class SortedArraySearch {


    public int seachTargetIndex(int[] arr, int target) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex <= rightIndex) {
            int mid = leftIndex+(rightIndex -leftIndex) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target) {
                leftIndex = mid+1;
            } else {
                rightIndex = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SortedArraySearch s = new SortedArraySearch();
        int ss = s.seachTargetIndex(new int[] {-1,0,3,5,9,11,24} , 9);
        System.out.println(ss);
    }

}
