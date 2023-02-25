import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(countSubarrays(arr, k));
    }

    public static long countSubarrays(int[] nums, long k) {
        //Write your code here
        long result =0;
        long current=0;
        for(int i=0,j=0;j<nums.length;j++){
            current+=nums[j];
            while(current*(j-i+1)>=k){
                current-=nums[i++];
            }
            result+=j-i+1;
        }
        
    return result;
    }
    

}
