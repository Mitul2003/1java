package Mitul;

public class S_Linear_Search {
    public static void main(String[] args) {
        // Linear search
        // best time com : o(1)  -> constants time complexity
        // worst time com : o(n)

        //if we got how many num in Digit
        System.out.println((int)(Math.log10(152365)) + 1);

        int[] arr = {5,3,6,8,9,7,1};
        System.out.println("Linear search : " + Linear_Search(arr,7));
        System.out.println("Minimum Element : "+ min(arr));
    }
    static int Linear_Search(int[] arr,int target){
        if(arr.length == 0) return -1;

        for (int index = 0; index < arr.length ; index++)
        {
            int ele = arr[index];
            if(ele == target){
                return index;
            }
        }
        return -1;
    }

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 1 ; i < arr.length ; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
