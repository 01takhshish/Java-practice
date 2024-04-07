import java.util.Scanner;

public class bit{
    static void bubblesort(int arr[]){
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    static void selectivesort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int smallest = i;
            for (int j =i + 1; j < n ; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
    static void insertionsort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while( j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }

    static void insertion(int arr[]){
        for(int i =1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while( j>=0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
            System.out.println(arr[j+1]);
        }
    }

    public static void main(String args[]){

        Scanner size = new Scanner(System.in);
        int arr[] = new int[6];
        for(int i =0; i<arr.length; i++){
            arr[i] = size.nextInt();
        }
            
        insertion(arr);
    
        for(int i =0; i<6; i++){
            System.out.print( arr[i] + " ");
        }
    }
}


// import java.util.Scanner;

// public class bit {
//     // public static void main(String args[]){
//     //     int n = 7;
//     //     int pos = 3;
//     //     int bitWise = 1<< pos;

//     //     if((bitWise & n) == 0){
//     //         System.out.println("bit was zero");
//     //     }
//     //     else{
//     //         System.out.println("bit was one");
//     //     }
//     // }

//     // public static void main(String args[]){
//     //     Scanner bit = new Scanner(System.in);
//     //     int n = bit.nextInt();
//     //     int pos = 1;
//     //     int bitwise = 1 << pos;
//     //     int newbit = (bitwise | n) ;
//     //     System.out.println(newbit);
//     // }

//     // public static void main(String args[]){
//     //     Scanner bit = new Scanner(System.in);
//     //     int n = bit.nextInt();
//     //     int pos = 2;
//     //     int bitwise = 1<< pos;
//     //     int newbitWise = ~(bitwise);
//     //     int newno = (newbitWise & n);
//     //         System.out.println(newno);
//     //     }

//     public static void main(String args[]){
//         // int n = 5;
//         // Scanner pos = new Scanner(System.in);
//         // int position = pos.nextInt();
//         // int operation = pos.nextInt();
//         // int bitwise = 1<< position;
//         // if (operation == 1){
//         //     int newno = bitwise | n;
//         //     System.out.println(newno);
//         // }
//         // else{
//         //     int newbitWise = ~(bitwise);
//         //     int newno = newbitWise & n;
//         //     System.out.println(newno);
//         // }


//         // double n = 8.00;
//         // double p = Math.pow(n, 3);
//         // double a = Math.sqrt(n);
//         // System.out.println(a);
//         // System.out.print(p);

//         // int n = 21;
//         // if  ((n & 1)==0){
//         //     System.out.println("It is.");
//         // }
//         // else{
//         //     System.out.println("It's not");
//         // }

//         int n = 7;
//         // if((n & n-1) ==0){
//         //     System.out.println(0);
//         // }
//         // else{
//         //     System.out.println(1);
//         // }
//         System.out.println(Integer.toString(n, 2));
//         String binary = Integer.toString(n, 2);
//         int count =0;
        
//         for (int i =0; i< binary.length(); i++){
//             if(binary.charAt(i) == '1'){
//                   count +=1;
//             }
//             else{
//                 continue;
//             }
//         }
//         System.out.println(count);
//     }
// }


