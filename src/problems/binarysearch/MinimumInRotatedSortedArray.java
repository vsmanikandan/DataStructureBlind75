package problems.binarysearch;

public class MinimumInRotatedSortedArray {
    public int findMinInSortedRotatedArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            int mid = left+(right-left)/2;
            if(arr[mid] > arr[right]) {
                left = mid +1;
            } else {
                right  = mid;
            }
        }

        return arr[left];
    }

    public static void main(String[] args) {
        MinimumInRotatedSortedArray m = new MinimumInRotatedSortedArray();
        System.out.println(m.findMinInSortedRotatedArray(new int[] {8,7,6,5,0,1,2,3,4}));
    }
}
