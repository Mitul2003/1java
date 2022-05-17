package com.company;

import java.util.Locale;

public class java14_string_methods {
    public static void main(String[] args) {
          String A = "Mitul";
//        String sc = new String("hello");
//
//        String ustring = A.toUpperCase();
//        System.out.println(ustring);
//
//        System.out.println(A.substring(2));
//        System.out.println(A.substring(1,4));   // index start 0
//
//        System.out.println(A.replace('M','h'));
//        System.out.println(A.replace("itu","tul"));
//
//        System.out.println(A.startsWith("Mit"));
//        System.out.println(A.endsWith("ul"));

//        System.out.println(A.charAt(0));
//
//        System.out.println(A.indexOf("t"));
//        System.out.println(A.indexOf("t",3));

        String name ="Mitulllltull";
        System.out.println(name.lastIndexOf("tul"));
//        System.out.println(name.indexOf("tul"));

        System.out.println(A.equals("Mitul"));
        System.out.println(A.equalsIgnoreCase("MiTul"));

        System.out.println("I am escape sequence\"double \n quote");
    }
}
