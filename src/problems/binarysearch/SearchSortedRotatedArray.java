package problems.binarysearch;

public class SearchSortedRotatedArray {
    public int findInSortedRotatedArray(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int mid = left + (right - left) /2;
            if(target == arr[mid]) {
                return mid;
            }
            //left side is sorted
            if(arr[left] <= arr [mid]) {
                if(target >= arr[left] && target < arr[mid]) {
                    right = mid-1;
                } else {
                    left = mid + 1;
                }
            } else {
                // right half is sorted
                if(target >= arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SearchSortedRotatedArray s = new SearchSortedRotatedArray();
        int ss = s.findInSortedRotatedArray(new int[] {4,5,6,7,0,1,2,3} , 2);
        System.out.println(ss);
    }
}
