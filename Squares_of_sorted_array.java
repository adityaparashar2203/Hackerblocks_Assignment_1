import java.util.*;
public class Main {


    public static int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];

        }
        Arrays.sort(nums);
        return nums;
    }




    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        arr = sortedSquares(arr);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
