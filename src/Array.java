// import java.util.Scanner;
// import java.util.Arrays;

// public class Array {
//     public static void main(String args[]){

// Spiral Matrix-----------------------------------------------
//    01 02 03 04 05     
//    16 17 18 19 06
//    15 24 25 20 07
//    14 23 22 21 08
//    13 12 11 10 09 

// Scanner size = new Scanner(System.in);
// int n = size.nextInt();
// int m = size.nextInt();

// int[][] matrix = new int[n][m];

// for(int i =0; i<n; i++){
//     for(int j =0; j<m; j++){
//         matrix[i][j] = size.nextInt();
//     }
// }

// int r=0;
// int c=0;
// int r_end = n-1;
// int c_end = m-1;

// while (r <= r_end && c <= c_end){
//     for (int j =c; j<= c_end; j++){
//         // Print the first row where i is constant and j is increasing-----
//         System.out.print(matrix[r][j]+" ");
//     }
//     r++;
//     for(int i=r; i<=r_end; i++){
//         // This segment will print the last column where row will increase by 1 from last time... 
//         // ...beacuse """matrix[0][n-1]""" is already filled in the last loop. 
//         System.out.print(matrix[i][c_end]+" ");
//     }
//     // until now our 1st row and last column is filled (row --"0"  and  column--"n-m")
//     c_end--;
//     for( int j = c_end; j>= c; j--){
//         System.out.print(matrix[r_end][j]+ " ");
//     }
//     r_end--;
//     for(int i=r_end; i>r; i--){
//         System.out.print(matrix[i][c] +" ");
//     }
//    c++;
//    System.out.println(); 
// }

// int[] numbers = new int[10];
// numbers[0] = 78;
// numbers[9] = 89374;
// numbers[2] = 34;
// numbers[1] = 45;
// numbers[6] = 22;
// System.out.println(numbers[1]);
// System.out.println(numbers[8]);

// Scanner nen = new Scanner(System.in);
//     int arrar[] = {23,56,343,67,223,7887,2223,345775,90};
//     int max = arrar[0];
//     int n = arrar.length;
//     for (int i =1; i< arrar.length; i++){
//         if(max < arrar[i]){
//             max = arrar[i];
//         }
//     }

//     int sort_arrar[] = new int[n];
//     int min = arrar[0];
//     for(int i =0; i<n; i++){

//     }

//     System.out.println(max);
//     int newmax = Arrays.stream(arrar).max().getAsInt();
//     System.out.println(newmax);

//    Arrays.sort(arrar);
//    System.out.println(arrar[n-1]);
//    System.out.println(Arrays.toString(arrar));

// int a= nen.nextInt();
// int newArray[] = new int[a];

// for (int i =0; i< a; i++){
//     newArray[i] = nen.nextInt();
// }

// for (int j = 0; j<a; j++){
//     System.out.print(newArray[j] +" ");
//     if (newArray[j] == 24){
//         System.out.println(j);
//     }
// // }
// System.out.print(newArray.length);

// Scanner size = new Scanner(System.in);
// int n= size.nextInt();
// int m = size.nextInt();
// int[][] matrix = new int[n][m];

// for(int i =0; i<n; i++ ){
//     for(int j=0; j<m; j++){
//         matrix[i][j] = size.nextInt();
//     }
// }

// for(int i=0; i<n; i++){
//     for(int j=0; j<m; j++){
//         System.out.print(matrix[i][j] + " ");
//     }
//     System.out.println();
// }

// Transpose-- of matrix-----
//       Scanner size = new Scanner(System.in);
//       int n= size.nextInt();
//       int m = size.nextInt();
//       int matrix[][] = new int[n][m];

//       for(int i=0; i<n;  i++){
//         for(int j=0; j<m; j++){
//             matrix[i][j] = size.nextInt();
//         }
//       }
// // Interchanging the row and column--------
//       for(int j=0; j<m; j++){
//         for(int i = 0; i<n; i++){
//             System.out.print(matrix[i][j]+" ");
//         }
//         System.out.println();
//       }

// **************************************************************************************************
// STRINGS--------------------------------------

// public class Array {
//   public static void main(String args[]) {

    // String array[] = new String[5];
    // int totalLength = 0;
    // for(int i =0; i<5; i++){
    // array[i] = strings.nextLine();
    // totalLength += array[i].length();
    // }
    // System.out.println(totalLength);

    // String result = "";
    // for(int i = 0; i< name.length(); i++){
    // if (name.charAt(i) == 'e'){
    // result += 'i';
    // }
    // else{
    // result += name.charAt(i);
    // }
    // }
    // System.out.print(result);

    // Scanner builder = new Scanner(System.in);
    // String strings = builder.nextLine();
    // StringBuilder ab = new StringBuilder(strings);
    // System.out.println(ab);
    // System.out.println(ab.charAt(0));
    // ab.setCharAt(0, 'i');
    // ab.insert(0, '*');
    // System.out.println(ab);
    // ab.delete(ab.length()-1, ab.length());
    // System.out.println(ab);
    // ab.append(". I'm still learning");
    // System.out.println(ab);

    // **********************************************************************************************************************
    // Reverse the strins

    // Scanner rev = new Scanner(System.in);
    // // String st = rev.nextLine();
    // StringBuilder str = new StringBuilder("the one two and three");
    // int mid = str.length()/2;
    // int last = str.length() - 1;

    // for (int i = 0; i >= mid; i++) {
    //   int first = i;
    //   int back = last - i;

    //   char frontChar = str.charAt(first);
    //   char backchar = str.charAt(back);

    //   str.setCharAt(first, backchar);
    //   str.setCharAt(back, frontChar);
    // }
    // System.out.println(str);
    // System.out.println(str.reverse());
    // int arr[] = {2,3,4,5,3,2,4,4};
    // System.out.println(arr.length);

//   }
// }

import java.util.*;

// import org.w3c.dom.Node;

// public class Array {
//         Node head;
//         private int size;

//         Array(){
//           size =0;
//         }

//         public class Node{
//             int data;
//             Node next;

//             Node(int data){
//               this.data= data;
//               this.next = null; 
//             }
//         }