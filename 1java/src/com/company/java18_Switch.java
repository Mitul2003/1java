package com.company;
import java.util.Scanner;
public class java18_Switch {
    public static void main(String[] args) {

        //inharns Switch
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {
            case 18 -> System.out.println("First");
            case 20 -> System.out.println("Second");
            case 22 -> System.out.println("Third");
            default -> System.out.println("dee");
        }
    }
}
