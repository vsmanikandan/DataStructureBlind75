package problems.hashing;

public class Anagram {

    public boolean validAnagram(String s1, String s2) {
        s1 = s1.toLowerCase().replace(" ", "");
        s2 = s2.toLowerCase().replace(" ", "");

        if(s1.length() != s2.length()) {
            return false;
        }

        int[] count =  new int[26];
        for(int i=0; i< s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c: count) {
            if(c!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Anagram a = new Anagram();
        System.out.println(a.validAnagram("the classroom","school master"));
    }

}
