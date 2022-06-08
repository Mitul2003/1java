package Pattan;

public class q_1  {
    public static void main(String[] args) {
        // first

//        int n = 5;
//        for(int i = 1 ; i < n*2 ; i++)
//        {
//            int col = i > n ? 2 * n - i : i;
//                for (int j = 1; j <= col; j++)
//                    System.out.print("*" + " ");
//                System.out.println();
//        }

//        int n = 5;
//        for(int i = 1 ; i <= n ; i++)
//        {
//            for (int space = 1 ; space <= n-i ;  space++){
//                System.out.print(" ");
//            }
//                for (int j = 1; j <= i; j++) {
//                        System.out.print("*");
//                }
//                System.out.println();
//        }

//        int n = 5;
//        for(int i = 1 ; i <= n*2 ; i++)
//        {
//            int col = i > n ? 2 * n - i : i;
//            int space = n-col;
//            for (int s = 1 ; s <= space ;  s++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= col; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n = 5;
//        for(int row = 1 ; row <= n ; row++)
//        {
//            int space = n-row;
//            for(int s = 1 ; s <= space ; s++){
//                System.out.print("  ");
//            }
//
//            for(int col = row ; col >= 1 ; col--)
//            {
//                System.out.print(col + " ");
//            }
//            for(int col = 2 ; col <= row ; col++)
//            {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }

//                1
//              2 1 2
//            3 2 1 2 3
//          4 3 2 1 2 3 4
//        5 4 3 2 1 2 3 4 5
//          4 3 2 1 2 3 4
//            3 2 1 2 3
//              2 1 2
//                1
        int n = 5;
        for(int row = 1 ; row <= n*2 ; row++)
        {
            int c = row > n ? n * 2 - row : row;
            int space = n-c;
            for(int s = 1 ; s <= space ; s++){
                System.out.print("  ");
            }

            for(int col = c ; col >= 1 ; col--)
            {
                System.out.print(col + " ");
            }
            for(int col = 2 ; col <= c ; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }

//        0 0 0 0 0 0 0 0 0
//        0 1 1 1 1 1 1 1 0
//        0 1 2 2 2 2 2 1 0
//        0 1 2 3 3 3 2 1 0
//        0 1 2 3 4 3 2 1 0
//        0 1 2 3 3 3 2 1 0
//        0 1 2 2 2 2 2 1 0
//        0 1 1 1 1 1 1 1 0
//        0 0 0 0 0 0 0 0 0

//        int n = 4 * 2;
//        int originalN = 4;
//        for(int row = 0 ; row <= n; row++){
//            for(int col = 0 ; col <= n; col++){
//                int ateveryindex = Math.min(Math.min(row,col),Math.min(n - row,n - col));
//                System.out.print(ateveryindex + " ");
//            }
//            System.out.println();
//        }

//        for(int row = 1 ; row < n; row++){
//            for(int col = 1 ; col < n; col++){
//                int ateveryindex = originalN+1 - Math.min(Math.min(row,col),Math.min(n - row,n - col));
//                System.out.print(ateveryindex + " ");
//            }
//            System.out.println();
//        }
    }


}
