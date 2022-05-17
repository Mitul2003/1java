package Mitul;

import java.util.ArrayList;
import java.util.List;

public class ArraySoluation {
    public static void main(String[] args) {

        // sum of Diagonal Element
        int[][] mat = {
                {1,2,3},
                {1,2,3},
                {1,2,3}
        };
        System.out.println("Sum of Diagonal Element is : " + diagonalSum(mat));

    }

    public static int diagonalSum(int[][] mat) {
            int n = mat.length;
            int sum = 0;
            for(int i = 0 ; i < n ; ++i)
                sum += mat[i][i] + mat[i][n-i-1];

            if(n % 2 != 0){
                sum -= mat[n/2][n/2];
            }
            return sum;
        }
    static List<Integer> LuckyNumber (int[][] mat){
        // problem : https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/

        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < mat.length ; i++){
            int minidx = 0;
            int min = 999999999;
            for(int j = 0 ; j < mat[i].length ; j++){
                if(mat[i][j] < min) {
                    min = mat[i][j];
                    minidx = j;
                }
            }
            boolean isTrue = true;
            for(int j = 0 ; j < mat.length ; j++){
                if(mat[i][minidx] < mat[j][minidx]) {
                    isTrue = false;
                    break;
                }
            }
            if(isTrue) arr.add(mat[i][minidx]);
        }
        return arr;
    }
}
