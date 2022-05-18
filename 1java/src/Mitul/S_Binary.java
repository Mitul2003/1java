package Mitul;

public class S_Binary {
    public static void main(String[] args) {

        // best case : o(1)
        // warst case : o(N/2 nd power kth = 1)  => considar both side log = [log base 2 power N]
                      // = log of N
//        int[] arr = {1,5,6,9,10,44,88,99};
        int[] arr = {111,45,36,29,10,4,3,1};
        int ans = binary(arr,11);
        System.out.println(ans);
    }



    static int binary(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        boolean isAsc = arr[start] < arr[end];
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if(isAsc) {
                    if (arr[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                else {
                    if (arr[mid] > target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
            return -1;

    }
}
