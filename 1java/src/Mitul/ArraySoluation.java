package Mitul;

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
}
