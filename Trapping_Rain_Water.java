import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
         int[] arr=new int[n];
           for (int i = 0; i < n; i++) 
            arr[i]=scn.nextInt();
            System.out.print(trap(arr)); 
    }
    public static int trap(int[] height) {
        // Write your code here
        int[] left=new int[100000];
        int[] right=new int[100000];
        int n=height.length;
        left[0]=height[0];
        right[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        int water=0;
        for(int i=0;i<n;i++){
            int curr=Math.min(left[i],right[i])-height[i];
            water+=curr;

        }
        return water;
    }
}
