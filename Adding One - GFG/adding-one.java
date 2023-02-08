//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Vector<Integer> ans = new Solve().addOne(a, n);
            printAns(ans);
        }
    }
    public static void printAns(Vector<Integer> ans) {
        for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
        System.out.println();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    // function for adding one to number
    Vector<Integer> addOne(int[] a, int n)
    {
        int carry=1;
        Vector<Integer>v=new Vector<>();
        for(int i=a.length-1;i>-1;i--)
        {
            int tem=carry+a[i];
            carry=tem/10;
            tem=tem%10;
            v.add(tem);
        }
        if(carry!=0)
        {
            v.add(carry);
        }
        Collections.reverse(v);
        return v;
        // code here
    }
}