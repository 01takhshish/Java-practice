// import java.util.*;

// public class hashQuestions {
//     public static void check_Frequency(int arr[]){
//        HashMap<Integer, Integer>  map = new HashMap<>();
//        int n = arr.length;
//        int k= n/3;
//        for(int i=0; i<n; i++){
//         if(map.containsKey(arr[i])){
//             map.put(arr[i], map.get(arr[i])+1);
//         }else{
//             map.put(arr[i], 1);
//         }
//        }
//        Set<Integer> keys = map.keySet();
//        for(int key : keys){
//         if(map.get(key)> k){
//             System.out.print(key + " ");
//         }
//        }
//     }

//     public static void union(int setA[], int setB[]){
//         HashSet<Integer> union = new HashSet<>();
//         for(int i=0;  i<setA.length; i++){
//             union.add(setA[i]);
//         }
//         for(int i=0;  i<setB.length; i++){
//             union.add(setB[i]);
//         } 
//         Iterator set = union.iterator();
//         while(set.hasNext()){
//             System.out.print(set.next()+ " ");
//         }       
//     }

//     public static void interset(int setA[], int setB[]){
//         HashSet<Integer> seta = new HashSet<>();
//         for(int i =0; i<setA.length; i++){
//            seta.add(setA[i]);
//         }

//         HashSet<Integer> interset = new HashSet<>();
//         for(int i =0; i<setB.length; i++){
//             if(seta.contains(setB[i])){
//                 interset.add(setB[i]);
//                 seta.remove(setB[i]);
//             }else{
//                 continue;
//             }
//         }
//         System.out.print(interset +" ");
//     }

//     public static String itinerary(HashMap<String, String> map){
//         HashMap<String, String> revmap = new HashMap<>();
//         for(String key : map.keySet()){
//             revmap.put(map.get(key), key);
//         }

//         for(String key: map.keySet()){
//             if(!revmap.containsKey(key)){
//                 return key;
//             }
//         }
//         return null;
//     }

// //!!!!!!!!!!!!!!!!!!!!----Subarray sum Equal to k--------------------------------------------

//     public static void subarray(){
        
//     }
//     public static void main(String args[]){
//         // int arr[] ={ 1,2,3,4,1,5,2,1,3,1,7};
//         // check_Frequency(arr);
//         // int setA[] = {1,3,4,5, 80,21};
//         // int setB[] = {1,4,7,8,5,3,7,85,5,3,9};
//         // union(setA, setB);
//         // interset(setA, setB);
//         HashMap<String, String> map = new HashMap<>();
//         map.put("Mumbai", "Delhi");
//         map.put("Chenni", "Mumbai");
//         map.put( "Delhi", "Kashmir");
//         String First =itinerary(map);
//         while(map.containsKey(First)){
//             System.out.print(First + "-->");
//             First = map.get(First);
//         }
        
//     }
    
// }
