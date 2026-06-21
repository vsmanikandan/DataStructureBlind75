package problems.hashing;

import java.util.Arrays;

public class ProductOfArrayExcpectSelf {


    public void calcProduct(int[] array) {

        int[] leftArr =  new int[array.length];
        int[] rightArr = new int[array.length];
        int leftPdt = 1, rightPdt=1;
        for(int i=0; i<array.length;i++) {
            if(i==0) {
                leftArr[i] = leftPdt;
                continue;
            }
            leftPdt = leftPdt*array[i-1];
            leftArr[i]=leftPdt;
        }
        for(int i=array.length-1; i>=0;i--) {
            if(i==array.length-1) {
                rightArr[i] = rightPdt;
                continue;
            }
            rightPdt = rightPdt*array[i+1];
            rightArr[i]=rightPdt;
        }
        int[] result =  new int[array.length];
        for(int i = 0; i<leftArr.length;i++) {
            result[i] = leftArr[i]*rightArr[i];
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        ProductOfArrayExcpectSelf p = new ProductOfArrayExcpectSelf();
        p.calcProduct(new int[]{5,2,3,1,4});
    }

}
