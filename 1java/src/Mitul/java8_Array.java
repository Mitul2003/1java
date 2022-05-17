package Mitul;

import java.util.Arrays;
import java.util.Scanner;

public class java8_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        // store in stack
//        //array of primitiv
//        int[] arr = new int[5];   // 0 // dynemic memory allocation
//                                    // Depend to JVM to continuas memory or not
//
//        int[] rno = {25,36,25,24,3};
//
//        for (int i = 0 ; i < arr.length ; i++)
//        {
//            arr[i] = in.nextInt();
//        }
//
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));
//
//        // array of object
//        // store in heap
//        String[] arr2 = new String[5];  //


        //  MultiDimension Array

        int[][] arr1 = new int[3][];  // num of row compulsory

        int[][] arr = {
                {1, 2, 3},
                {4, 5 },
                {7, 8, 9}
        };

//        System.out.println(arr.length);  // give num. of Row
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
//                arr[row][col] = in.nextInt();
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        for(int row = 0 ; row < arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        for(int[] num : arr){
            System.out.println(Arrays.toString(num));
        }

       
       
    }
}
