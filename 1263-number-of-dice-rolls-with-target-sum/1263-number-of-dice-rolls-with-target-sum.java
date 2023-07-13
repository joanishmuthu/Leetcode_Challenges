class Solution {
    int mod=1000000007;
    //RECURSION
    public long rec(int n,int face,int target,long [][]dp){
        if(target<0)return 0;
        if(n!=0&&target==0)return 0;
        if(n==0&&target!=0)return 0;
        if(n==0&&target==0) return 1;
        if(dp[n][target]!=-1)return dp[n][target];
        long ans=0;
        for(int i=1;i<=face;i++){
            ans+=(rec(n-1,face,target-i,dp));
        }
        return dp[n][target]=ans%mod;
    }
    //TABULATION
    public int numRollsToTarget(int n, int k, int target) {
        long[][]dp=new long[n+1][target+1];
        dp[0][0]=1;
        for(int a=1;a<=n;a++){
            for(int j=1;j<=target;j++){
                long ans=0;
                for(int i=1;i<=k;i++){
                 if(j-i>=0) ans+=dp[a-1][j-i];
        }
            dp[a][j]=ans%mod;
            }
        }
        return (int)(dp[n][target]%mod);
    }
}