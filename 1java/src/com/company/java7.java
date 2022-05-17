package com.company;

import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {
        // Que 4

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the kilometers  : ");
        float A = sc.nextFloat();
//        1 km = (1/1.609344) mi = 0.62137119 mi
        float mile = A/1.609344f;
        System.out.println("kilometers to mile converjation is : " + mile + "mile");

    }
}
