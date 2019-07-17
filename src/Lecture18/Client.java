package Lecture18;

public class Client {
    public static void main(String[] args) {
        Tries trie = new Tries();

        trie.add("art");
        trie.add("arts");
        trie.add("bug");
        trie.add("boy");
        trie.add("sea");
        trie.add("see");
        trie.add("seen");

//        trie.display();
//
//        System.out.println(trie.search("sea"));
//
//        trie.displayAsTree();

        trie.remove("arts");
        trie.displayAsTree();
        trie.display();
    }
}
