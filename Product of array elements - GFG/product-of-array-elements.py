#User function Template for python3

# arr is the array
# n is the number of element in array
# mod= modulo value
def product(arr,n,mod):
    s=1
    for i in range(n):
        s=s*arr[i]
    return int(s%mod)
    # your code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=="__main__":
    t=int(input())
    mod=1000000007
    for j in range(t):
        n=int(input())
        arr=list(map(int,input().split()))
        print(product(arr,n,mod))
# } Driver Code Ends