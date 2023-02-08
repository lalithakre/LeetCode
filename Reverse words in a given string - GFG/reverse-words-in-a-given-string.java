//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 

{
    //Function to reverse words in a given string.
   String reverseWords(String S)
    {
        String str = "";

        int count = 0;

        int start = S.length()-1;

        for(int i=S.length()-1;i>=0;i--){

            if(S.charAt(i)=='.' && count ==0){

                str = str + S.substring(i+1,start+1);

                start = i;

                count++;

            }

            else if(S.charAt(i)=='.'){

                str = str + S.substring(i,start);

                start = i;

            }

        }

        if(S.charAt(start)=='.'){

            str = str + '.' +S.substring(0,start);

        }

        else

        str = str+S.substring(0,start+1);

        return str;

    }

}