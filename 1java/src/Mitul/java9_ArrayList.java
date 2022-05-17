package Mitul;

import java.util.ArrayList;
import java.util.Scanner;

public class java9_ArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array list
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(60);
//        list.add(62);
//        list.add(63);
//
//        System.out.println(list.contains(62));
//        list.set(0,61);
////      list.remove(2);
//        System.out.println(list);

//        for (int i = 0 ; i < 5 ; i++){
//            list.add(in.nextInt());
//        }
//        for (int i = 0 ; i < 5 ; i++){
//            System.out.println(list.get(i));   // pass the index value
//        }

        // MultiArray List

        ArrayList<ArrayList<Integer>> mlist = new ArrayList<>();
        // initialisation
        for(int i = 0 ; i < 3 ; i++){
            mlist.add(new ArrayList<>());
        }
        // add element
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ;  j < 3 ; j++){
                mlist.get(i).add(in.nextInt());
            }
        }

        System.out.println(mlist
        );


    }
}
