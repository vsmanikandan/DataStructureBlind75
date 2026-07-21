package problems.tries;

public class Trie {
    TrieNode root;
    public  Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for(char ch : word.toCharArray()) {
            int index = ch - 'a';
            if(current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for(char ch : word.toCharArray()) {
            int index = ch - 'a';
            if(current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfWord;
    }

    public boolean startsWith(String word) {
        TrieNode current = root;
        for(char ch : word.toCharArray()) {
            int index = ch - 'a';
            if(current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    //test
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("batsman");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        System.out.println(trie.startsWith("bats"));
        trie.insert("app");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
    }
}
