package com.company;
import java.util.Scanner;

public class java19_practice_4 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if((year%400 == 0) || ((year%4 == 0) && (year%100 != 0)))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("noo");
        }
    }
}
