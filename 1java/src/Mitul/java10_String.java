package Mitul;

import java.util.Arrays;

public class java10_String {
    public static void main(String[] args) {
//        int[] arr = {1,3,4,5};
//        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4}));
//        String[] name = new String[5];

        // first method to store value of string

        String a = "Mitul";  // point same obj in stack
        String b = "Mitul";  // point same obj in stack
//
//        //==  => comperison op. return true if both String point to the same object
        System.out.println(a == b);

//        System.out.println(a +" "+ b);
//        b = "Dudhat"; // create new object
//        System.out.println(a + " " + b);

        // secon method to store value of string
        // create new object out side the string pool
        String c = new String("Mitul"); // create new obj
        String d = new String("Mitul"); // crreate new obj

        System.out.println(c == d);
        System.out.println(c.equals(d));

        System.out.println(c.charAt(0));



    }
}
