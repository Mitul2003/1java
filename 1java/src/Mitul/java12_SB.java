package Mitul;

import java.util.Arrays;

public class java12_SB {
    public static void main(String[] args) {
        // Muteble
        StringBuilder build = new StringBuilder();
        char s = ' ';
        for (int i = 0 ; i < 26 ; i++)
        {
            s = (char) ('a' + i);
            build.append(s);
        }

        System.out.println(build);
        build.reverse();
        System.out.println(build);

        String name = "Kunal Kushwaha Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Kunal   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
