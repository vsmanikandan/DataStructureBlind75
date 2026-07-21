package problems.tries;

public class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode current = root;
        for(char ch :  word.toCharArray()) {
            int index =  ch - 'a';
            if(current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public boolean normalSsearch(String word) {
        TrieNode current  = root;
        for(char ch : word.toCharArray()) {
            int index = ch - 'a';
            if(current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfWord;
    }

    public boolean matchFinder(String  word) {
        return searchHelper(word, 0, root);
    }

    private boolean searchHelper(String word,
                                 int i,
                                 TrieNode root) {
        TrieNode current = root;
        if(i == word.length()) {
            return current.isEndOfWord;
        }
        //normal character
        char ch = word.charAt(i);
        if(ch != '.') {
            int childIndex = ch - 'a';
            if(current.children[childIndex] == null) {
                return false;
            }
            return searchHelper(word, i+1, current.children[childIndex]);
        }
        //.wild card search
        for(TrieNode child : current.children) {
            if(child != null) {
                if(searchHelper(word,i, child)) {
                    return true;
                }
            }
        }
        return false;
    }


}
