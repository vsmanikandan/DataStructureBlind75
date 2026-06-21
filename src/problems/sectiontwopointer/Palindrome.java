package problems.sectiontwopointer;

public class Palindrome {

    public boolean isPalindrom(String str) {
        String inpString = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i=0,j=inpString.length()-1;
        while(i<j) {
            if(inpString.toCharArray()[i] == inpString.toCharArray()[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {
    Palindrome p = new Palindrome();
    System.out.println(p.isPalindrom("No, it is opposition"));
}
}
