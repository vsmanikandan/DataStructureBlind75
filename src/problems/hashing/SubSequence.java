package problems.hashing;

public class SubSequence {
    public boolean isSubSequence(String s1, String s2) {
        int i=0 , j=0;
        while(i < s1.length() && j < s2.length()) {
            if(s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s1.length();
    }
    public static void main(String[] args) {
        SubSequence s = new SubSequence();
        System.out.println(s.isSubSequence("abc", "ahdbgc"));
        System.out.println(s.isSubSequence("axc", "abcfghq"));

    }
}
