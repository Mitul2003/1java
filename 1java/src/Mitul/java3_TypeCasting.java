package Mitul;

import java.util.Scanner;

public class java3_TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float a = input.nextFloat();
//        float b = input.nextInt();  // auto matic type converjaction
//
//        System.out.println(a);
//        System.out.println(b);

        // type casting
        int num = (int) (546.5f);
        System.out.println(num);

        // byte expression convert to int
        byte b = 42;
        char c = 'a';
        short s = 85;
        int i = 500000;
        float f = 45.55f;
        double d = 34534.432;
        double result = (f * b) + (i / c) + (d + s);
        // float + int + double = double
        System.out.println((f * b) + " "+(i / c) + " "+(d + s));
        System.out.println(result);


    }
}
