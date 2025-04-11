package application;

import java.util.ArrayList;

public class re {
	public  int maximumAmountInt(int arr[], int n) {
		// Your code here
		int[][] dp=new int[n+1][n+1];

		for (int w = 0; w < n; w++) {
			for (int i = 0, j = w; j <n; i++, j++) 
			{
				int x=0,y=0,z=0;
			    if (i+2<=j) {
					 x=dp[i+2][j];

				}
			    else {
			    	x=0;
			    }
				if(i+1<=j-1) {
					y=dp[i+1][j-1];
				}
				else {
					y=0;
				}
				if(i<=j-2) {
				z=dp[i][j-2];
				}
				else {
					z=0;
				}

				dp[i][j]=Math.max(arr[i]+Math.min(x, y), arr[j]+Math.min(y, z));
				
				//System.out.println("J="+j);
			}
		}

		return dp[0][n-1];
	}
	public   ArrayList<Integer> maximumAmuntCoines(int arr[], int n) {
		// Your code here
		int[][] dp=new int[n][n];
		 int[][] pick = new int[n][n]; 
		for (int w = 0; w < n; w++) {
			for (int i = 0, j = w; j <n; i++, j++) 
			{
				int x=0,y=0,z=0;
			    if (i+2<=j) {
					 x=dp[i+2][j];

				}
			    else {
			    	x=0;
			    }
				if(i+1<=j-1) {
					y=dp[i+1][j-1];
				}
				else {
					y=0;
				}
				if(i<=j-2) {
				z=dp[i][j-2];
				}
				else {
					z=0;
				}
				 if (arr[i] + Math.min(x, y) > arr[j] + Math.min(y, z)) {
	                    pick[i][j] = i; // Record picking `i`
	                } else {
	                    pick[i][j] = j; // Record picking `j`
	                }

				dp[i][j]=Math.max(arr[i]+Math.min(x, y), arr[j]+Math.min(y, z));	
			}
		}
		ArrayList<Integer> chosenNumbers = new ArrayList<>();
        int i = 0, j = n - 1;
        while (i <= j) {
            if (pick[i][j] == i) {
                chosenNumbers.add(arr[i]);
                i++;
                if (i <= j) i++; // Skip opponent's choice
            } else {
                chosenNumbers.add(arr[j]);
                j--;
                if (i <= j) j--; // Skip opponent's choice
            }
        }


        return  chosenNumbers;
		
	}
	public   int[][] maximuAmountMatrix(int arr[], int n) {
		// Your code here
		int[][] dp=new int[n+1][n+1];

		for (int w = 1; w <= n; w++) {
			for (int i = 1, j = w; j <= n; i++, j++) 
			{
				int x=0,y=0,z=0;
			    if (i+2<=j) {
					 x=dp[i+2][j];

				}
			    else {
			    	x=0;
			    }
				if(i+1<=j-1) {
					y=dp[i+1][j-1];
				}
				else {
					y=0;
				}
				if(i<=j-2) {
				z=dp[i][j-2];
				}
				else {
					z=0;
				}

				dp[i][j]=Math.max(arr[i-1]+Math.min(x, y), arr[j-1]+Math.min(y, z));
			}
		}
		  for (int i = 1; i < n+1; i++) {
	            dp[0][i] = arr[i-1]; // First row
	            dp[i][0] = arr[i-1]; // First column
	        }
		   return dp;
		
	}
}
