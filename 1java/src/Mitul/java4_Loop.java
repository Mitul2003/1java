package Mitul;

import java.util.Scanner;

public class java4_Loop {
    public static void main(String[] args) {
//        int a = 10;
//        if(a == 10){
//            System.out.println("Condition is true");
//        }
//        else if (a < 10) {
//            System.out.println("a is less than 10");
//        }
//        else {
//            System.out.println("Condition is false");
//        }

//        int count = 1;
//        while (count != 5){
//            System.out.println(count);
//            count++;
//        }

//        int n = 1;
//        do {
//            System.out.println(n);
//            n++;
//        }while (n != 1);


//        for(int i = 0 ; i < 5 ; i++){
//            System.out.println(i);
//        }

        // lagest number

        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruit");
            case "Apple" -> System.out.println("Sweet fruit");
            default -> System.out.println("Please Enter fruit");
        }


//        int a= 10,b= 20,c = 40;
//
//        int maxx = Math.max(c,Math.max(a,b));
//        System.out.println(maxx);

    }
}
