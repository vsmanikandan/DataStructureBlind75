package problems.stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {
    public int[] dailyTemperature(int[] temp) {
       int days = temp.length;
       Stack<Integer> st = new Stack<>();
       int[] ans = new int[days];
       for(int i=0; i<days; i++) {
           while(!st.isEmpty() && temp[i] > temp[st.peek()]) {
               int prevIndex = st.pop();
               ans[prevIndex] = i - prevIndex;
           }
           st.push(i);
       }
        System.out.println(Arrays.toString(ans));
       return ans;
    }
    public static void main(String[] args) {
        DailyTemperature dt = new DailyTemperature();
        dt.dailyTemperature(new int[] {73,74,75,71,69,72,76,73});

    }
}
