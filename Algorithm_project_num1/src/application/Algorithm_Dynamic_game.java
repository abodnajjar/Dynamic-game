package application;
import java.util.ArrayList;
import java.util.List;
public class Algorithm_Dynamic_game {
	private static int sum;
	private static int[][] dps;
	private static StringBuilder selectedNumbers ;

	public static   void maximuAmountMatrix(int arr[], int n) {
		// Your code here
		int[][] dp=new int[n+1][n+1];
		int[][] pick = new int[n + 1][n + 1]; // Matrix to track choices
		for (int i = 1; i <= n; i++) {
		    dp[i][i] = arr[i - 1];
		    pick[i][i] = i;
		    if (i < n && arr[i - 1] >= arr[i]) { // Handle two adjacent elements
		        dp[i][i + 1] = arr[i - 1];
		        pick[i][i + 1] = i;
		    } else if (i < n) {
		        dp[i][i + 1] = arr[i];
		        pick[i][i + 1] = i + 1;
		    }
		}
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

				if (arr[i - 1] + Math.min(x, y) > arr[j - 1] + Math.min(y, z)) {
					dp[i][j] = arr[i - 1] + Math.min(x, y);
					pick[i][j] = i; // Record the pick
				} else {
					dp[i][j] = arr[j - 1] + Math.min(y, z);
					pick[i][j] = j; // Record the pick
				}
			}
		}
		for (int i = 1; i < n+1; i++) {
			dp[0][i] = arr[i-1]; // First row
			dp[i][0] = arr[i-1]; // First column
		}
		StringBuilder Numbers = new StringBuilder();

		int i = 1, j = n;

		while (i <= j) {
			if (pick[i][j] == i) {
				Numbers.append(arr[i - 1]).append(",");
				i++; // Move to the next range
				if (i <= j) i++; // Skip opponent's choice
			} else {
				Numbers.append(arr[j - 1]).append(","); 
				j--; // Move to the next range
				if (i <= j) j--; // Skip opponent's choice
			}
		}


		dps=dp;
		sum=dp[1][n];
		selectedNumbers=Numbers;
	}


	public static StringBuilder getSelectedNumbers() {
		return selectedNumbers;
	}


	public static void setSelectedNumbers(StringBuilder selectedNumbers) {
		Algorithm_Dynamic_game.selectedNumbers = selectedNumbers;
	}


	public static int getSum() {
		return sum;
	}


	public static void setSum(int sum) {
		Algorithm_Dynamic_game.sum = sum;
	}


	public static int[][] getDps() {
		return dps;
	}


	public static void setDps(int[][] dps) {
		Algorithm_Dynamic_game.dps = dps;
	}


}


