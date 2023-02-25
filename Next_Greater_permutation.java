import java.util.*;
public class Main {

    public static void nextPermutation(int[] nums) {
        int find=0;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                find=1;
                for(int j=nums.length-1;j>i;j--){
                    if(nums[j]>nums[i]){
                        int temp=nums[j];
                        nums[j]=nums[i];
                        nums[i]=temp;
                        break;
                    }
                }
                reverse(nums,i+1);
            }
            if(find==1){
                break;
            }
        }
        if(find==0){
            reverse(nums,0);
        }
    }
    public static void reverse(int nums[],int x){
        int end=nums.length-1;
        int st=x;
        while(st<end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;end--;
            }
        }
    


    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        nextPermutation(arr);
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
