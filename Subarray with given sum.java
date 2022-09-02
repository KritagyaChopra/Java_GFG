//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}
// } Driver Code Ends

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        if(s==0){
            arr1.add(-1);
            return arr1;
        }
        int sum =0;
        
        int j = 0;
        while( j<n){
            sum=0;
            for(int i=j ; i<n ; i++){
                if(sum<s){
                    sum+=arr[i];
                }
                if(sum==s){
                    arr1.add(j+1);
                    arr1.add(i+1);
                    return arr1;
                }
                if(sum>s){
                    break;
                }
            }
            j++;
        }
        if(arr1.isEmpty()){
            arr1.add(-1);
        }
        return arr1;
    }
}
