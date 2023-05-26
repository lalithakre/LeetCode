//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String firstRepChar(String S) 
    { 
        HashSet<Character> hs = new HashSet<>();
        String temp = "";
        for (int i = 0; i < S.length(); i++) 
        {
        if(!hs.contains(S.charAt(i)))
            {
                hs.add(S.charAt(i));
            }
        else
            {
                temp = Character.toString(S.charAt(i));
                break;
            }
        }
        if(temp.isEmpty())
        {
            temp = "-1";
        }
        return temp;
    }
} 