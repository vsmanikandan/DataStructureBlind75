package problems.hashing;

import java.util.*;

public class GroupAnagram {

    public String groupWithSort(String[] arr) {
        Map<String, List<String>> groupedVal =  new HashMap<>();
        for(String s :  arr) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            groupedVal.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
        }
        return groupedVal.toString();
    }

    public String groupWithFreq(String[] arr) {
        Map<String, List<String>> groupedVal =  new HashMap<>();
        for (String s:  arr) {
            int[] count = new int[26];
            for(char c : s.toCharArray()) {
                count[c-'a']++;
            }
            StringBuilder key = new StringBuilder();
            for(int num : count) {
                key.append('#').append(num);
            }

            groupedVal.computeIfAbsent(key.toString(), k-> new ArrayList<>()).add(s);
        }
        return groupedVal.toString();
    }

    public static void main(String[] args) {
        GroupAnagram g = new GroupAnagram();
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(g.groupWithFreq(arr));
        System.out.println(g.groupWithSort(arr));
    }

}
