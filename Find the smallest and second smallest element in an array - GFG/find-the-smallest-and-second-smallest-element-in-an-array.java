//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        Set<Long>s=new TreeSet<>();
        long arr[]=new long[2];
        if(n==0)
        {
            arr[0]=-1;
            // arr[1]=-1;
            return arr;
        }
        else if(n==1)
        {
            // arr[0]=a[0];
            arr[0]=-1;
            return arr;
        }
        else
        {
            for(int i =0;i<n;i++)
            {
                s.add(a[i]);
            }
            if(s.size()<2)
            {
                arr[0]=-1;
                return arr;
            }
            int i=0;
            for(Long j:s)
            {
                if(i==2)
                {
                    return arr;
                }
                arr[i]=j;
                i++;
            }
            return arr;
        }
            
    }
}
