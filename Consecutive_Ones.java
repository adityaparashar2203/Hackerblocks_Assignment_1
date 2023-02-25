import java.util.*;
public class Main {



    public static int consecutive1(int[] arr)
    {
        int count=0;
        int start=0;
        for(int end=0;end<arr.length;end++){
            if(arr[end]==0){
                start=end+1;
            }
            count=Math.max(count,end-start+1);
        }
        return count;
    }



    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(consecutive1(arr));
    }

}
