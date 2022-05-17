package com.company;

import java.util.Locale;

public class java15_prectis_set_3 {
    public static void main(String[] args) {
        //problam 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        //problam 2
        String text ="To lower case";
        text = text.replace(" ","_");
        System.out.println(text);

        //problem 3
        String letter = "Dear <|name|> ,Thanks a lot!";
        letter = letter.replace("<|name|>","Mitul");
        System.out.println(letter);

        //problem 4
        String myString ="This String contain       double and triple apace";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //problem 5
        String letter2 = "Dear Mitul,\n\tThis java cource is Nice.\n\tThanks!";
        System.out.println(letter2);

    }
}
