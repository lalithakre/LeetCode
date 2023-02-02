//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
    public:
     pair<int,int> endPoints(vector<vector<int>> matrix){
        		int dir[5] = {-1 , 0 , 1 , 0 , -1}; 
		int curr = 1;
		int i = 0 , j = 0 ; 
		while(i < matrix.size() && j < matrix[0].size() && i>=0 && j >=0){
		    
		    if(matrix[i][j] == 0){
		        i+= dir[curr]; 
		        j+= dir[curr+1]; 
		    }
		    else {
		        matrix[i][j] = 0; 
		        curr++; 
		        curr %=4 ; 
		        i+= dir[curr]; 
		        j+= dir[curr+1]; 
		    }
		}
		i -= dir[curr]; 
		j-= dir[curr+1]; 
		return {i,  j}; 
    }
};

//{ Driver Code Starts.


int main()
{
    int tc;
	scanf("%d", &tc);
	while(tc--){
		int row, col;
		scanf("%d", &row);
		scanf("%d", &col);
		vector<vector<int>> matrix(row , vector<int> (col));
	 
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
			    cin>>matrix[i][j];
			}
		}
		Solution obj;
		pair<int,int> p = obj.endPoints(matrix);
		
		cout << "(" << p.first << ", " << p.second << ")" << endl;
	}
	return 0;
}
// } Driver Code Ends