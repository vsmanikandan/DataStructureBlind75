package problems.tries;

import java.util.List;

public class ArrayWordSearch {
    TrieNode root;
    public ArrayWordSearch() {
        root = new TrieNode();
    }

    public void insertWord(TrieNode root,String word) {
        TrieNode current = root;
        for(char ch : word.toCharArray()) {
            int index = ch - 'a';
            if(current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.word = word;
    }

    private void dfs(char[][] board,
                     int row,
                     int col,
                     TrieNode node,
                     List<String> result) {
        //boundary check
        if(row < 0 || row >= board.length ||
                col<0 || col > board[0].length) {
            return;
        }

        //skip already visited
        if(board[row][col] == '#') {
            return;
        }

        char ch = board[row][col];
        int childIndex = ch - 'a';
        TrieNode next = node.children[childIndex];

        //no dictionary word has this prefix
        if(next == null) {
            return;
        }


        if(next.word != null) {
            result.add(next.word);
            next.word = null; //prevent duplicate result
        }

        board[row][col] = '#';
        dfs(board, row+1, col, next,result);
        dfs(board, row-1, col, next,result);
        dfs(board, row, col+1, next,result);
        dfs(board, row, col-1, next,result);
        board[row][col] = ch;//backtrack
    }
}
/**
 * Am i outside the board - return it
 * Is cell already visited -  return it
 * Get the board character
 * Does the trie have the character?
 *    -if no character return it
 *    -if yes character find the word and mark the word as null to avoid dups
 * mark the cell is visited
 * do dfs in up, down, right, left directions
 * restore current cell back to character
 */
