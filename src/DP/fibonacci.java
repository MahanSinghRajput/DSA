package DP;

import java.util.*;

public class fibonacci {
    public static int fibo(int n, int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fibo(n-1,dp)+fibo(n-2,dp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Memoization
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fibo(n,dp));

        //tabular
        int[] dp2 = new int[n+1];
        dp2[0] = 0;
        dp2[1] = 1;
        for(int i=2;i<=n;i++) dp2[i] = dp2[i-1] + dp2[i-2];
        System.out.println(dp2[n]);

        //optimizing space
        int prev2 = 0, prev = 1;
        for(int i=2;i<=n;i++){
            int curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        System.out.println(prev);
    }
}
