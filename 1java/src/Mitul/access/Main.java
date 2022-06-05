package Mitul.access;

import java.util.ArrayList;
// encapsulation : hiding all sensitiv data(implitation level problem)
// adstacstion : hiding unnessary data and show nessesary data(Design level problem)


public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Kunal");
        // need to do a few things
        // 1. access the data members
        // 2. modify the data members

        ArrayList<Integer> list = new ArrayList<>(23);
//        list.DEFAULT_CAPACITY;

        obj.getNum();
        int n = obj.num;
    }
}
