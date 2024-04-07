import java.util.*;
// import java.util.ArrayList;
// import java.util.Scanner;

public class backtracking {
    public static void printpermutation(String str, String permutaion){
        if(str.length() ==0){
            System.out.println(permutaion);
            return;
        }
    
        for(int i=0; i<str.length();  i++){
            char curchar = str.charAt(i);
            String totalString = str.substring(0, i) + str.substring(i+1);
            printpermutation(totalString, permutaion+curchar);
        }
    }

    //************************************************* Chess Board Finnd Queens Safe place */

    // public List<List<String>> solveQ(int n){
    //     char[][] board = new char[n][n];
    // }
    

    // public static void main(String[] args) {
    
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
        
    // }

    // **************************************************************** MERGE SORT *************************************
    public static void divide(int arr[], int si, int ei){
       if(si>= ei){
          return;
       }
       int mid = si + (ei-si)/2 ;
       divide(arr, si, mid);
       divide(arr, mid+1, ei);
       conquer(arr, si, mid, ei);
    }

    public static void conquer(int arr[], int si, int mid, int ei){
        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid+1;
        int x =0;
        while( idx1 <= mid && idx2 <= ei ){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1<=mid){
           merged[x++] = arr[idx1++];
        }
        while(idx2<=ei){
           merged[x++] = arr[idx2++];
        }
        for(int i =0, j=si; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }

    }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int[] arr = new int[n];
    //     for(int i =0; i<n; i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     divide(arr, 0, n-1);
    //     for(int i=0; i<n ; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }
// public class number{
    public static boolean palind(String str){
        int n = str.length() -1;
        int i =0;
        while(i < n){
            if(str.charAt(i) != str.charAt(n)){
                return false;
            }

            i++;
            n--;

        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        palind(a);
        if(palind(a)){
            System.out.println("yes");
        }
        else{
          System.out.println("no");
        }
    }
}
