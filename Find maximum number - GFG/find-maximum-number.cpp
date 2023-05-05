//{ Driver Code Starts

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
  public:
    string findMax(string N) 
    {
        sort(N.begin(),N.end());
        for(int i=0, j=N.size()-1;i<j;i++,j--)
        {
            char tem=N[i];
            N[i]=N[j];
            N[j]=tem;
        }
        return N;
        // code here
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string N;
        
        cin>>N;

        Solution ob;
        cout << ob.findMax(N) << endl;
    }
    return 0;
}
// } Driver Code Ends