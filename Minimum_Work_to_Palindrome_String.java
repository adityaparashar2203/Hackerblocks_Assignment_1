import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(minMovesToMakePalindrome(str));
    }
    public static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
      
    public static int minMovesToMakePalindrome(String s) {
        int n=s.length();
        char st[]=s.toCharArray();
        int count=0;
        for(int i=0;i<n/2;i++){
            int left=i;
            int right=n-left-1;
            while(left<right){
                if(st[left]==st[right]){
                    break;
                }
                else{
                    right--;
                }
            }
            if(left==right){
                swap(st,left,left+1);
                count++;
            }
            else{
                for(int j=right;j<n-left-1;j++){
                    swap(st,j,j+1);
                    count++;
                }
            }
        }
        return count;

    }
}
