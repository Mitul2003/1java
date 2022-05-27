package Mitul;

import java.util.Scanner;

public class java12_StringPelidrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println(name.length());
        boolean ans = true;
        for(int i = 0 ; i < name.length() / 2 ; i++){
            char start = name.charAt(i);
            char end = name.charAt(name.length() - 1 - i);
            if (start != end) {
                ans = false;
                break;
            }
        }

        System.out.println("ans is :" + ans);
    }
}
