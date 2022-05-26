package Mitul;

import java.util.ArrayList;

public class java11_PrettyPrinting {
    public static void main(String[] args) {
        float a = 12.34566778f;
//        System.out.printf("formatted num is %.2f",a);
        System.out.printf("pi value is %.2f",Math.PI);

        // conconet operator
        System.out.println();
        System.out.println('a' + 'b');
        System.out.println((char) ('a' + 1));

        System.out.println("a" + "b");
        System.out.println("a" + 1);
        // same as "a"+"1"

        System.out.println("Mitul" + new ArrayList<>());
        // minimum one vlue of string
//        System.out.println(new Integer(56) + new ArrayList<>());
        System.out.println(new Integer(56) + " " +new ArrayList<>());
    }
}
