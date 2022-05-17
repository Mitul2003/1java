package Mitul;

import java.util.Arrays;
import java.util.Scanner;

public class java5_Function {
    static int x = 90;  // this will shadow at line 8
    public static void main(String[] args) {
        int a = 10;

//        int ans = sum();
//        System.out.println(ans);



//        {
//            int c = 20;
//            a = 20;  // change original val.
////            block scope
//        }
//        System.out.println(a);
////      System.out.println(c);  // var c can not av.
//        int c = 20;             // we can declar the var. c



//        int[] arr = {5,10,15,20,25,30};
//        changearr(arr);  // passing value by refrancing
//        System.out.println(Arrays.toString(arr));

        System.out.println("x var is : " + x);
        int x = 80;
        System.out.println("x var is : " + x);


    }

    static void  changearr(int[] array){
        array[5] = 10;
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        num1 = in.nextInt();
        num2 = in.nextInt();

        return num1+num2;
//        System.out.println(num1+num2);
    }
}
