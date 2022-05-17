package Mitul;

import java.util.Scanner;

public class java7_IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int num = in .nextInt();


//        System.out.println(isprime(num));

//        System.out.println(isArmstong(num));
        for(int i = 100; i < 1000 ; i++)
        {
//            System.out.println(i + " is Armstrong num : "+isArmstong(i));
            if(isArmstong(i)) {
                System.out.println("Armstrong num is : " + i);
            }

        }
    }



//    static boolean isprime(int num) {
//        if(num <= 1){
//            return false;
//        }
//        int c = 2;
//        while (c * c <= num){
//            if(num % c == 0)
//                return  false;
//            c++;
//        }
//        return c * c > num;
//    }

    static boolean isArmstong(int n){
        int rem;
        int original = n;
        int sum = 0;

        while (n > 0){
            rem = n % 10;
            sum += (rem * rem * rem);
            n /= 10;
        }
        return sum == original;
    }
}
