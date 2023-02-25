import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
         int[] arr=new int[n];
           for (int i = 0; i < n; i++) 
            arr[i]=scn.nextInt();
            System.out.print(maxProfit(arr)); 
    }
      public static int maxProfit(int prices[]) {
        int maxpro=0;
        int minpro=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
          if(prices[i]<minpro){
            minpro=prices[i];
            if(prices[i]-minpro>maxpro){
              maxpro=prices[i]-minpro;
              }
            }
            else{
              if(prices[i]-minpro>maxpro){
                maxpro=prices[i]-minpro;
              }
            }
            }
            return maxpro;
    }
}
