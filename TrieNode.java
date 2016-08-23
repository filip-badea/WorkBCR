package Trie;

import java.util.HashMap;

/**
 * Created by filip.badea on 8/23/2016.
 */
class TrieNode {
    char c;
    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    boolean isLeaf;

    public TrieNode() {}

    public TrieNode(char c){
        this.c = c;
    }
}