import java.util.*;
public class Main {



    public static int maxConsecutive1(int[] arr,int k)
    {
        int result=0;
        for(int i=0,j=0;j<arr.length;j++){
              if (arr[j]==0){
                  k--;
              }
              while(k<0){
                  if(arr[i]==0){
                      k++;
                  }
                  i++;
              }
              result=Math.max(result,j-i+1);

        }
        return result;
    }



    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(maxConsecutive1(arr,k));
    }

}
