import java.util.*;
public class Main {


    public static int[] maxSlidingWindow(int[] nums,int k) {
        int[] ans=new int[nums.length-k+1];
        int n=nums.length;
        int max=0;
        for(int i=0;i<=n-k;i++){
            max=nums[i];
            for(int j=i+1;j<i+k;j++){
                max=Math.max(nums[j],max);
            }
            ans[i]=max;
        }         
        return ans;
    }




    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        arr = maxSlidingWindow(arr,k);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
