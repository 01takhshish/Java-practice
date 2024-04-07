import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class function {
    public static void firstFunction(int n) {
        // int lcm;
        // lcm = (n > n1) ? n : n1;
        // while (true) {
        //     if (lcm % n == 0 && lcm % n1 == 0) {
        //         System.out.println(lcm);
        //         break;
        //     }
        //     ++lcm;
        // }

        // int a = n;
        // int b  = n1;
        // while(n != n1){
        //     if (n>n1){
        //         n = n-n1;
        //     }
        //     else{
        //         n1 = n1-n;
        //     }
            
        // }
        
        // int newLcm = (a*b)/ n;
        // System.out.println(newLcm);
        // return;


        // int sum =1;
        // System.out.print(1);
        // for (int i = 2; i <= n; i++){
        // if( i % 2 ==0){
        // continue;
        // }
        // else{
        // sum += i;
        // System.out.print(" + " + i);
        // }
        // }
        // System.out.printf(" \nThe sum of the given numbers is %s", sum);

        // System.out.println(Math.max(n, n1));
        // int i =1;
        // do{
        // System.out.print("*");
        // i ++;
        // }
        // while(i!= 0);

        // int count = 0;
        // long rem;
        // int sumPositive = 0;
        // int sumNegative = 0;
        // int totalZero = 0;
        // while (n !=0){
        // rem = n % 10;
        // if (rem>0){
        // sumPositive += rem;
        // }
        // if (rem == 0){
        // totalZero += 1;
        // }
        // n = n/ 10;
        // count += 1;
        // }
        // System.out.println(totalZero);
        // System.out.println(sumPositive);
        // System.out.println(count);

        // int gcd = 1;
        // while (n != n1){
        // if (n> n1){
        // n = n-n1;
        // }
        // else{
        // n1 = n1 - n;
        // }
        // }
        // System.out.println(n);

        
        int a= 0;
        int b = 1;
        int sum = 0;
        System.out.print(a +" "+ b);
        while(n > 0){
            sum = a + b;
            int temp = b;
            b = sum ;
            a = temp;
            System.out.print(" " + sum);
            n -=1;
        }
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            Scanner nene = new Scanner(System.in);

            // double n, n1;
            // n = nene.nextDouble();
            // n1 = nene.nextDouble();
            int c = nene.nextInt();
            // int a = nene.nextInt();

            firstFunction(c);
            t -= 1;
        }
    }
}
