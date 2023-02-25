import java.util.*;
public class Main {



    public static int countNiceSubArrays(int[] arr,int k)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }

        int ans=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int diff=sum-k;
            if(map.containsKey(diff)){
                ans+=map.get(diff);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
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

        System.out.println(countNiceSubArrays(arr,k));
    }

}
