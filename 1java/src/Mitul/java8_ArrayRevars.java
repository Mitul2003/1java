package Mitul;

import java.util.Arrays;

public class java8_ArrayRevars {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };

        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void reverse(int[] arr){
        int start = 0 ;
        int end = arr.length - 1;

        while (start < end) {
            //swap
            swap(arr, start, end);
                start++;
                end--;

        }
    }
}
