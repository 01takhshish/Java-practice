public class Trie {
    static class Node{
        Node[] children;
        boolean eow; //{end of word}

        public Node() {
            children = new Node[26];
            for(int i=0; i<26; i++){
                children[i] = null;
            }
            eow = false;
        }
    }
    static Node root = new Node();
    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';

            if(curr.children[idx] == null){
                //add
                curr.children[idx] = new Node();
            }
            if(i == word.length()-1){
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            Node curr1 = curr.children[idx]; 
            if(curr1 == null){
                return false;
            }
            if(i == word.length() -1 && curr1.eow == false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String args[]){
        String words[] = {"the", "where", "pan", "panCake" , "reg" , "register"};
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        String search_words[] = {"any", "their" , "whereas", "reg"};
        for(int i = 0; i<search_words.length; i++){
            System.out.println(search(search_words[i]));
        }
    }
    
}

// public class Trie{
//      static class Node{
//          Node[] children;
//         boolean eow; //{end of word}
// // 
//         public Node() {
//             children = new Node[26];
//             for(int i=0; i<26; i++){
//                 children[i] = null;
//             }
//             eow = false;
//         }
//     }
//     static Node root = new Node();
//      public static void insert(String word){
//         Node curr = root;
//         for(int i=0; i<word.length(); i++){
//             int idx = word.charAt(i)-'a';

//             if(curr.children[idx] == null){
//                 //add
//                 curr.children[idx] = new Node();
//             } 
//             if(idx == word.length()-1){
//                curr.children[idx].eow = true;
//             }
//             curr = curr.children[idx];
//         }
//      }
//      public static boolean search(String str){
//         Node curr = root;
//         for(int i=0; i<str.length(); i++){
//             int idx = str.charAt(i) - 'a';
//             if(curr.children[idx] == null){
//                 return false;
//             }
//             if(i == str.length()-1 && curr.children[idx].eow == false){
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return true;
//      }

//      public static void main(String args[]){
//         String words[] = {"the", "where", "pan", "panCake" , "reg" , "register"};
//         for(int i=0; i<words.length; i++){
//             insert(words[i]);
//         }

//         // insert(str);
//         String search_words[] = {"any", "their" , "whereas", "reg"};
//         for(int i = 0; i<search_words.length; i++){
//             System.out.println(search(search_words[i]));
//         }
//      }
// }