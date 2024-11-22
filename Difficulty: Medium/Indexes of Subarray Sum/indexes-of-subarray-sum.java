//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int d = Integer.parseInt(read.readLine().trim());

            Solution ob = new Solution();
            ArrayList<Integer> result = ob.subarraySum(nums, d);
            // Print all elements in the result list
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println(); // Print a new line after the result
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
          // code here
           // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        int left=0;
        int arrsum=0;
        int n=arr.length;
        for(int right=0;right<n;right++)
        {
            arrsum += arr[right];
            while(arrsum > target && left < right)
            {
                arrsum -= arr[left];
                left++;
            }
            if(arrsum == target)
            {
                list.add(left+1);
                list.add(right+1);
                return list;
            }
        }
        list.add(-1);
        return list;
        
    }
}