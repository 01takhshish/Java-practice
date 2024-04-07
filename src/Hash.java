// import java.util.HashSet;
import java.util.*;

// import java.util.Iterator;

// import Trees.Node;

public class Hash {

    // -----------------------------------------------------------------------------------------------------------
    // ------HASHSET-----
    // public static void main(String args[]){
    // HashSet<Integer> set = new HashSet<>();
    // set.add(1);
    // set.add(8);
    // set.add(2);
    // set.add(2);
    // set.add(5);
    // set.add(6);
    // System.out.println(set);
    // System.out.println(set.size());
    // set.remove(1);
    // if(set.contains(1)){
    // System.out.println("yes");
    // }
    // if(!set.contains(3)){
    // System.out.println("nope");
    // }
    // //
    // Iterator it = set.iterator();
    // while(it.hasNext()){
    // System.out.print(it.next() +" ");
    // }
    // }

    // ----------------------------------------------------------------------------------------
    // HASHMAP

    // public static void main(String args[]){
    // HashMap< Integer, String> map = new HashMap<>();
    // map.put(1240023, "Caste Cerificate");
    // map.put(1240024, "Domicile Cerificate");
    // map.put(1240025, "Birth Cerificate");
    // map.put(1240026, "Date Cerificate");
    // System.out.println(map);
    // if(map.containsKey(1240023)){
    // System.out.println(map.get(1240023));
    // System.out.println("yes");
    // }
    // else{
    // System.out.println("nope");
    // }

    // //Iteraor
    // for(Map.Entry<Integer, String> e: map.entrySet()){
    // System.out.print(e.getKey());
    // System.out.println(e.getValue());
    // }
    // map.remove(1240023);
    // Set<Integer> keys = map.keySet();
    // for(Integer key : keys){
    // System.out.println(key + ":--" + map.get(key));
    // }
    // }
// ----------------------------//----------------------------------------------------------------------------------------------------------------
    static class HashMap<k, v> { // generics (don't know the type of key and value)
        private class ListNode {
            k key;
            v value;

            public ListNode(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n- nodes
        private int N; // N- buckets
        private LinkedList<ListNode> buckets[];

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(k key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N; // should be less than N
        }

        private int searchLL(k key, int bi) {
            LinkedList<ListNode> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if ((ll.get(i).key == key)) {
                    return i; // di
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<ListNode> oldBuckets[] = buckets;
            buckets = new LinkedList[N * 2];
            for (int i = 0; i < n * 2; i++) {
                buckets[i] = new LinkedList<>();
            }
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<ListNode> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    ListNode node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(k key, v value) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi); // di = -1
            if (di == -1) {
                buckets[bi].add(new ListNode(key, value));
                n++;
            } else {
                ListNode node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(k key){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);
            if(di == -1){
                return false;
            }
            else{
                return true;
            }
        }

        public v remove (k key){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);
            if(di ==-1){
                return null;
            }
            else{
                ListNode node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public v get(k key){
            int bi = hashFunction(key);
            int di = searchLL(key, bi);
            if(di == -1){
                return null;
            }else{
                ListNode node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<k> keySet(){
            ArrayList<k> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++){
                LinkedList<ListNode> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){
                    ListNode node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }

    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 7);
        map.put("USA", 12);
        map.put("Australia", 1);
        ArrayList<String> keys = map.keySet();
        for(int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }
        map.remove("USA");
        System.out.println(map.get("USA"));
    }
}
