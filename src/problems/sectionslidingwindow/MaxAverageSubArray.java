package problems.sectionslidingwindow;

public class MaxAverageSubArray {

    public void findMaxAverage(int[] arr, int k) {
        int current_sum=0;
        for(int i=0; i<k;i++) {
            current_sum+=arr[i];
        }
        int max_sum = current_sum;

        //enable sliding window till k length and k should be less than the length of array
        int m=0,n=k;
        while(n< arr.length) {
            current_sum -= arr[m];
            m++;
            current_sum +=arr[n];
            n++;
            max_sum = Math.max(max_sum, current_sum);
        }

        System.out.println("Max sum is:"+String.valueOf(max_sum));
        System.out.println("average is : "+String.valueOf(max_sum/k));
    }

    public static void main(String[] args) {
        MaxAverageSubArray m = new MaxAverageSubArray();
        m.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4);
    }
}
