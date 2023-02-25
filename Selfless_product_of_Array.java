import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
         int[] arr=new int[n];
           for (int i = 0; i < n; i++) 
            arr[i]=scn.nextInt();
        int[] ans = productExceptSelf(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        } 
    }
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] output=new int[n];
        int product=1;
        for(int i=0;i<n;i++){
            output[i]=product;
            product *= nums[i];
        }
        product=1;
        for(int i=n-1;i>=0;i--){
            output[i]*=product;
            product*=nums[i];

        }
        return output;
    }
}
