//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        int n = arr.length;
        if(n==1){
            return 0;
        }
        if(n<=0 || arr[0]==0){
            return -1;
        }
        int currMax = arr[0];
        int stepsCount = arr[0];
        int jump =0;
        for(int i = 1; i<n-1 ; i++){
            if(currMax < i+arr[i]){
                currMax = i+arr[i];
            }
            stepsCount--;
            if(stepsCount == 0){
                jump = jump+1;
                stepsCount = currMax-i;
            }
        }
        if(currMax >=arr.length-1)
            return jump+1;
        else{
            return -1;
        }
    }
}
