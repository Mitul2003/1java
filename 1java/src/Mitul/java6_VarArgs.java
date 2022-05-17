package Mitul;

import java.util.Arrays;

public class java6_VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7);
        multipal(1,2,"Mitul","Keyur","Vaibhav");
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));  // return array list
    }
    static void multipal(int a,int b,String ...s){
        System.out.println(Arrays.toString(s));

    }


    // in the function overlodinng embiguty possibal
}
