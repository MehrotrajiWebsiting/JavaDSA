import java.io.*;
public class Knapsack{
// Knapsack problem 
     public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());
       int[] price = new int[n];
       String str1 = br.readLine();

       for(int i=0;i<n;i++){
        price[i]=Integer.parseInt(str1.split(" ")[i]);
       }

       int[] weight = new int[n];
       String str2 = br.readLine();

       for(int i=0;i<n;i++){
        weight[i]=Integer.parseInt(str2.split(" ")[i]);
       }

       int cap = Integer.parseInt(br.readLine());


      int [][]dp = new int[n+1][cap+1];

      for(int j=0;j<=cap;j++){
        dp[0][j]=0;
      }

      for(int i=0;i<=n;i++){
        dp[i][0]=0;
      }

      for(int i=1;i<=n;i++){
        for(int j=1;j<=cap;j++){
            if(weight[i-1]>j)
            dp[i][j]=dp[i-1][j];
            else
            dp[i][j]=Math.max(dp[i-1][j],price[i-1]+dp[i-1][j-weight[i-1]]);
        }
      }
      
      System.out.println(dp[n][cap]);

     }
}
