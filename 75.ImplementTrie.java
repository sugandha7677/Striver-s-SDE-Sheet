public class Trie {


    //Initialize your data structure here
    private static Node root;
    Trie() {
        //Write your code here
        root = new Node();
    }


    //Inserts a word into the trie


    public static void insert(String word) {
        //Write your code here
        Node node = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch)){
                node.put(ch, new Node());
            }
            // moves to ref. trie
            node = node.get(ch);

        }
        node.setEnd();
    }
    // Tc: O(n)


    //Returns if the word is in the trie

    public static boolean search(String word) {
        //Write your code here
        Node node = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch)) return false;
        
            node = node.get(ch);
        }

        return node.isEnd();
    }

    
    //Returns if there is any word in the trie that starts with the given prefix

    public static boolean startsWith(String prefix) {
        //Write your code here
        Node node = root;
        for(int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i);
            if(!node.containsKey(ch)) return false;
        
            node = node.get(ch);
        }

        return true;
    }
}

class Node{
    Node [] links = new Node[26];
    boolean flag = false;

    Node(){

    }

    boolean containsKey(char ch){
        return  links[ch - 'a'] != null;
    }

    void put(char ch, Node node){
         links[ch - 'a'] = node;
    }

    Node get(char ch){
        return  links[ch - 'a'];
    }

    void setEnd(){
        flag = true;
    }

    boolean isEnd(){
        return flag == true;
    }
}