import java.util.Scanner;

public class App {

    static void printsum(int i,  int sum, int n){
        if(i == n){
           sum += i;
           System.out.println();
           System.out.println(sum);
           return;
        }
        sum += i;
        System.out.print(i);
        // System.out.println();
        printsum(i+1, sum, n);
        System.out.print(i);
    }

    // static void factorial(int i, int mul, int n){
    //     if(i == n){
    //         System.out.println(mul);
    //         return;
    //     }
    //     mul *= i;
    //     factorial(i+1, mul, n);
    // }

    // static int function(int n){
    //     if(n == 1 || n==0){
    //         return 1;
    //     }
    //     int fact = function(n-1);
    //     int newfact = n* fact;
    //     return newfact;     
    // }
    // public static void fabinci(int a, int b,int n){
    //     if(n==0){
    //         return;
    //     }
    //     int temp = a + b;
    //     a=b;
    //     b = temp;
    //     System.out.println(temp);
    //     fabinci(a , b, n-1);
    // }

    // public static void fibonacci(int a, int b,int n){
    //     if(n==0){
    //         return;
    //     }
    //     int temp = a + b;
    //     System.out.println(temp);
    //     fibonacci(b, temp, n-1);
    // }

    // public static int power(int x,int n){ // time == O(n)
    //     if( n==0){
    //         return 1;
    //     }
    //     if(x==0){
    //         return 0;
    //     }
    //     int pow = power(x, n-1);
    //     int value = x * pow;
    //     return value;
    // } 

    // public static int powerlog(int x, int n){ // time == O(logn)
    //     if(n==0){
    //         return 1;
    //     }
    //     if(x==0){
    //         return 0;
    //     }
        
    //     if(n%2 == 0){
    //         return powerlog(x, n/2) * powerlog(x, n/2);
    //     }

    //     else{
    //         return powerlog(x, n/2) * powerlog(x, n/2) * x;
    //     }
    // }

    public static void transfer(int n, String s, String h, String d){
        if(n==1){
            System.out.println("Disk " + n + " tranfer from " + s + " to " + d);
            return;
        }
        transfer(n-1, s, d, h);
        System.out.println("Disk " + n + " tranfer from " + s + " to " + d);
        transfer(n-1, h, s,d);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printsum(0, 0, n);
        // transfer(n, "A", "B", "C");      

    }


    // public static void reverse(String str, int n){
    //     if (n==0){
    //         System.out.print(str.charAt(n));
    //         return;
    //     }
    //     System.out.print(str.charAt(n));
    //     reverse(str, n-1);
    // }

    // public static int first =-1;
    // public static int last = -1;

    // public static void occurance(String str, int n, char search){
    //     if(n == str.length()) {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //       char currentchar = str.charAt(n);
    //       if(currentchar == search){
    //         if(first == -1){
    //         first = n;
    //       } else{
    //         last = n;
    //       }
    //     }
    //     occurance(str, n+1 , search);
    // }

    // public static boolean isSorted(int arr[], int n){
    //     if(n == arr.length -1){
    //         return true;
    //     }
    //     if(arr[n] >= arr[n+1]){
    //         return false;
    //     }else{
    //         return isSorted(arr, n+1);
    //     }
    // }

    // public static String moveAllX(StringBuilder str){
        // int count =0;
        // char el = 'x';
        // int n = str.length() -1 ;
        // for(int i=0; i<=n; i++){
        //     if(str.charAt(i) == el){
        //         count += 0;
        //         str.delete(i, i+1);
        //     }else{
        //         continue;
        //     }
        // }
        // for(int i= 1; i<= count; i++){
        //     str.append("x");
        // }
        // System.out.println(str);

    // }

    // public static String add(int count){
    //     String strx = "x";
    //     for(int i=0; i<count; i++){
    //          strx += "x";
    //     }
    //     return strx;
    // }

    // public static String moveAllX(String str, int n ,int count){
    //     if(n == str.length()){
    //         return add(count);
    //     }
    //     if (str.charAt(n) == 'x'){
    //           return moveAllX(str, n+1, count+1);
    //     }
    //     else{
    //         String newstr =  moveAllX(str, n+1, count);
    //         return str.charAt(n) + newstr;
    //     }
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     String str = sc.nextLine();
    //     String answer= moveAllX(str, 0, 0);
    //     System.out.println(answer);
    // }}
        // Scanner sc = new Scanner(System.in);
        // int arr[] = {1,2,3,4,6};
        // String str = sc.next();
        // int n = sc.nextInt();
        // int arr[] = new int[n-1];
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // reverse(str, str.length()-1);      
        // occurance(str, 0, 'a');
        // if (isSorted(arr, 0)){
        //     System.out.println("sorted");
        // }else{
        //     System.out.println("not sorted");
        // }

    // public static void main(String args[]){
    //     Scanner recur = new Scanner(System.in);
    //     int n = recur.nextInt();
    //     int x = recur.nextInt();
    //     // factorial(1, 1, n);
    //     // fabinci(0,  1, n); 
    //     int ans = powerlog(x, n);
    //     System.out.println(ans);
    // }

    // public static void main(String args[]){
    //     int n = 10;
    //     int n1 = 0;
    //     int n2 = 1;
    //     while(n>0){
    //        int temp = n1 + n2;
    //        n1 = n2;
    //        n2 = temp;
    //        System.out.print("" + temp + " ");
    //        n--;
    //     }
    // }
  
    public static void subseq(String str, int n, String subsequence){
        if(n ==str.length()){
            System.err.println(subsequence);
            return;
        }
        char newchar = str.charAt(n);
        //to be
        subseq(str, n+1, subsequence+newchar);
        // not to be
        subseq(str, n+1, subsequence);

    }
    public static boolean[] map = new boolean[26];

    public static void removeduplicate(String str, int n, String newstr){
        if(n == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(n);
        if(map[currchar - 'a']){
            removeduplicate(str, n+1, newstr);
        }else{
            map[currchar - 'a'] = true;
            removeduplicate(str, n, newstr+currchar);
        }
    }

    // public static String[] arr = {"yz", ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx"};

    // public static void phoneseq(String arrstr,  int n, String newstr){
    //     if(n== arrstr.length()){
    //         System.out.println(newstr);
    //         return;
    //     }
    //     char currchar = arrstr.charAt(n);
    //     String mapping = arr[currchar - '0'];
    //     for(int i=0; i<mapping.length();  i++){
    //         phoneseq(arrstr, n+1, newstr+mapping.charAt(i));
    //     }
    // }
    
    // public static void  uniquseq(String str, int n, String seqstr, HashSet<String> set){
    //     if(n== str.length()){
    //         if(set.contains(seqstr)){
    //             return;
    //         }
    //         else{
    //             set.add(seqstr);
    //             System.err.println(seqstr);
    //         }
    //     }
    //     char character = str.charAt(n);
    //     uniquseq(str, n+1, seqstr+character);
    //     uniquseq(str, n+1, seqstr);
    // }

    public static void printpermutation(String str, String permutaion){
        if(str.length() ==0){
            System.out.println(permutaion);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currchar = str.charAt(i);
            String charleft = str.substring(0, i);
            String charright = str.substring(i+1);
            String mainchoices = charleft + charright;
            printpermutation(mainchoices, permutaion+currchar);
        }
    }

    public static void mazeOutWays(int arr){

    }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
        // int matrix = {1,2,3,4,5,6,7,8,9};
        // String str = sc.nextLine();
        // String num = sc.next();
        // printpermutation(num, "");
        // System.out.println(num.substring(0, 0));
        // System.out.print(num.substring(0, 1));
        // String[] arr = {"yz","abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx"};
        // phoneseq(num, 0, "");
        // System.out.println(arr[0]);
        // String subsequence = "";
        // subseq(str, 0, subsequence);
        // removeduplicate(str, 0, "");
    // }

}


