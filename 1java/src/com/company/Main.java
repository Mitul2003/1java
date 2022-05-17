package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Heloo world");
    }

    public static class java6 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter out of mark : ");
            int outt = sc.nextInt();
            System.out.print("Enter the Mark of Sub1 : ");
            float sub1 = sc.nextFloat();
            System.out.print("Enter the Mark of Sub2 : ");
            float sub2 = sc.nextFloat();
            System.out.print("Enter the Mark of Sub3 : ");
            float sub3 = sc.nextFloat();
            System.out.print("Enter the Mark of Sub4 : ");
            float sub4 = sc.nextFloat();
            float total = sub1+sub2+sub3+sub4;
            outt = outt*4;
            float per = (total*100)/outt;
            System.out.print("Your per. is : " + per + "%");
        }
    }
}
