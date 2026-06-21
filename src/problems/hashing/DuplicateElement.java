package problems.hashing;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

    public boolean findDuplicates(int[] arr) {
        Set<Integer> values= new HashSet<>();
        for(int i=0; i< arr.length; i++) {
            if(!values.contains(arr[i])) {
                values.add(arr[i]);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DuplicateElement d = new DuplicateElement();
        int[] arr = {1,2,3,4,6,9};
        System.out.println(d.findDuplicates(arr));
    }
}
