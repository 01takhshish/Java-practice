import java.util.*;

public class revision {

// public static void swap(int a, int b){
//     int temp = a;
//     a =b;
//     b = temp;
// }

// public static void waveArray(int arr[], int n){
//     for(int i=0; i<n; i+=2){
//       swap(arr[i], arr[i+1]);
//     }
// }
   public static  void main(String args[]){
    int arr[] = {12,55,1,22,3,14,5};
    int n= arr.length;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
             if(arr[i]>arr[j]){
                arr[i] = arr[j];
             }   
        }
    }

    for(int num : arr){
        System.out.print(num + " ");
    }
    // int count =0;
    // Arrays.sort(arr);
    // int i=0;
    // while(i!= arr.length){
    //     if(arr[i] != arr[i+1]){
    //         System.out.println(arr[i]);
    //         break;
    //     }
    //     i +=2;
    // }
    // double a = 15/2;
    // double c = ("%.2f%", a);
    // System.out.println(c);

    
    // double n = (int)Math.ceil((double)15/2);
    // System.out.println(n);
   }
}
